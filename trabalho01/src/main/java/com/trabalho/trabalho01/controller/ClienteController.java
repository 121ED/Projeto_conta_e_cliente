package com.trabalho.trabalho01.controller;

import java.util.List;

import com.trabalho.trabalho01.model.Cliente;
import com.trabalho.trabalho01.repository.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
@CrossOrigin ("*")
public class ClienteController {
  
    @Autowired
    private ClienteRepo repo;
   
    @GetMapping() // Buscar todos os clientes
    public List<Cliente> obterTodos() {
        return (List<Cliente>) repo.findAll(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity <Cliente> obterTitular(@PathVariable long id){
        Cliente titularEncontrado = repo.findById(id).orElse(null);
        
        if (titularEncontrado !=null) {
            return ResponseEntity.ok(titularEncontrado); //retorna 200 - ok
        } else {
             return ResponseEntity.notFound().build(); //resposta vazia com 404
            } 
    }

}
