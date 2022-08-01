package br.com.stefanini.model;


import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    
    private Long cdPessoa; 
    private String nmPessoa; 
    private String email; 
    private String dtNascimento; 
    private String naturalidade; 
    private String nacionalidade;
    private String nrDocumento;  
    private String sexo;
    private String cep;
    private LocalDate dtCadastro;
    private LocalDate dtAtualizacao;
    
    public Long getCdPessoa() {
        return cdPessoa;
    }
    public void setCdPessoa(Long cdPessoa) {
        this.cdPessoa = cdPessoa;
    }
    public String getNmPessoa() {
        return nmPessoa;
    }
    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    } 
    public String getNrDocumento() {
        return nrDocumento;
    }
    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public LocalDate  getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(LocalDate  dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public LocalDate  getDtAtualizacao() {
        return dtAtualizacao;
    }

    public void setDtAtualizacao(LocalDate  dtAtualizacao) {
        this.dtAtualizacao = dtAtualizacao;
    }
}
