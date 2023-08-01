package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Compra;


@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {

}