package com.trabalho.trabalho01.repository;

import com.trabalho.trabalho01.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepo extends CrudRepository<Cliente,Long> {

    
}
