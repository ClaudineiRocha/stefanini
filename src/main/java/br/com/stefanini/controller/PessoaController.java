package br.com.stefanini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.stefanini.model.Pessoa;
import br.com.stefanini.service.PessoaService;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller 
@RequestMapping("/")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
 
    @GetMapping
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    } 

    @RequestMapping(value = "/buscarTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> buscarTodos(){

        return new ResponseEntity<>(pessoaService.buscarTodos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/buscarPorCpf/{cdPessoa}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> buscarPorCpf(@PathVariable("cdPessoa")final Integer cdPessoa) throws Exception {

        return new ResponseEntity<>(pessoaService.buscarPorCpf(cdPessoa), HttpStatus.OK);
    }

    @RequestMapping(value = "/salvarPessoa", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> salvarPessoa(@RequestBody Pessoa pessoa) throws Exception {

       pessoaService.salvarPessoa(pessoa); 
       return new ResponseEntity<>("Pessoa salva com sucesso", HttpStatus.OK); 
    }
 
    @DeleteMapping(value = "/excluirPessoa/{cdPessoa}") 
    public ResponseEntity<?> excluirPessoa(@PathVariable("cdPessoa") final Integer cdPessoa) throws Exception { 

        pessoaService.excluirPessoa(cdPessoa);
        return new ResponseEntity<>("Pessoa excluida com sucesso", HttpStatus.OK);      
    }

}
