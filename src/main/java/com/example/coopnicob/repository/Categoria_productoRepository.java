package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Categoria_producto;


@Repository
public interface Categoria_productoRepository extends CrudRepository<Categoria_producto, Long> {

}