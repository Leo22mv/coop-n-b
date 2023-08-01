package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Producto;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}