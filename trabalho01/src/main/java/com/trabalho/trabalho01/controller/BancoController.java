package com.trabalho.trabalho01.controller;

import java.util.List;

import com.trabalho.trabalho01.model.Banco;
import com.trabalho.trabalho01.repository.BancoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que a classe e um controller Rest
@RequestMapping("/contas")
@CrossOrigin("*") // Liberando para acesso de diferentes origens
public class BancoController {
   
    @Autowired
    private BancoRepo repo;

    
    @GetMapping()
        public List<Banco> obterTodos(){
        return (List<Banco>)repo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity <Banco> obterConta(@PathVariable long id){
        Banco contaEncontrada = repo.findById(id).orElse(null);
        
        if (contaEncontrada !=null) {
            return ResponseEntity.ok(contaEncontrada); //retorna 200 - ok
        } else {
             return ResponseEntity.notFound().build(); //resposta vazia com 404
            } 
    } 
}
