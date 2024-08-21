package br.com.unime.api1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @GetMapping
    public String index(){
        return "lista de pessoas";
    }
    @PostMapping
    public void create(){

    }
    @PostMapping
    public String update(){
        return "atualizado com sucesso!";
    }
    @GetMapping
    public String destroy(){
        return "removido com sucesso!";
    }


}
