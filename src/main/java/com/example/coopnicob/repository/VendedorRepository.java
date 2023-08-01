package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Vendedor;


@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long> {

}