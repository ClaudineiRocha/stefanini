package br.com.stefanini.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.stefanini.api.EnderecoApi;
import br.com.stefanini.model.Endereco;
import br.com.stefanini.model.Pessoa;
import br.com.stefanini.repository.PessoaRepository;
import br.com.stefanini.util.Formato;

@Service
public class PessoaService {
     
    @Autowired
    private EnderecoApi enderecoApi;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos() {

        return (List<Pessoa>) pessoaRepository.buscarTodos();
    }

     public List<Pessoa> buscarPorCpf(Integer cdPessoa) {

        return (List<Pessoa>) pessoaRepository.buscarPorCpf(cdPessoa);
    }

    @Transactional(rollbackFor = {Exception.class})
    public void salvarPessoa(Pessoa pessoa) throws Exception {

        Long nrDocumentoExistente = pessoaRepository.verificarPessoaExistente(pessoa.getCdPessoa());

         try {
            if(!Optional.ofNullable(nrDocumentoExistente).isPresent()) {
                validaDados(pessoa);
                pessoaRepository.inserir(pessoa);
             } else {
                validaDados(pessoa);
                pessoaRepository.atualizar(pessoa);
            }            
        } catch (Exception e) {
            throw new Exception("Erro ao gravar." + e.getMessage());
        }
    }  

    @Transactional(rollbackFor = {Exception.class})
    public void excluirPessoa(Integer cdPessoa) throws Exception {   
        try {
            if(Optional.ofNullable(cdPessoa).isPresent())
                pessoaRepository.excluirPessoa(cdPessoa);               
        } catch (Exception e) {
            throw new Exception("Erro ao excluir pessoa." + e.getMessage());
        }     
    }
 
    private String validaDados(final Pessoa pessoa) throws Exception {

        Formato formatar = new Formato();
        CPFValidator cpfValidator = new CPFValidator(); 

       /* List<Endereco> enderecos = enderecoApi.enderecoApi(pessoa.getCep());
        if(enderecos.isEmpty())
            throw new Exception("CEP ".concat(pessoa.getCep()).concat(" não encontrado"));*/

        if(!Optional.ofNullable(pessoa.getNmPessoa()).isPresent())  
            throw new Exception("O campo Nome é de preenchimento obrigatório");

        if(!Optional.ofNullable(pessoa.getDtNascimento()).isPresent())  
            throw new Exception("O campo Data de Nascimento é de preenchimento obrigatório");

        if(Optional.ofNullable(pessoa.getEmail()).isPresent())  
            formatar.validarEmail(pessoa.getEmail());

        if(!Optional.ofNullable(pessoa.getNrDocumento()).isPresent()){
             throw new Exception("O campo documento é de preenchimento obrigatório");
         } else {
             if(pessoa.getNrDocumento().length() == 11)
                 cpfValidator.assertValid(pessoa.getNrDocumento());
             else
                 throw new Exception("Numero documento "+pessoa.getNrDocumento()+" é invalido");
        }

        try { 

            try {
                LocalDate dtNasc = null;
                final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dtNasc = LocalDate.parse(pessoa.getDtNascimento().toString(), formatter);
                pessoa.setDtNascimento(dtNasc.toString());
            } catch (final Exception e) {
                throw new Exception("Erro ao formatar Data de Nascimento" + e.getMessage());
            }
            return "OK";
        } catch (final Exception e) {
            throw new Exception("Erro ao gravar pessoa" + e);
        }
    } 
     
}
