package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}