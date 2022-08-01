package br.com.stefanini.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.stefanini.model.Endereco;
import br.com.stefanini.model.Pessoa;  

@FeignClient(name = "${app.feign.config.name}", url = "${app.feign.config.url}")
public interface EnderecoApi {

    @RequestMapping(value="{cep}/json/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<Endereco> enderecoApi (@PathVariable String cep);
    
}
 