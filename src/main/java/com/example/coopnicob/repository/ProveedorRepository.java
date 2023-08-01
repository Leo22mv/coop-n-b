package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Proveedor;


@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {

}