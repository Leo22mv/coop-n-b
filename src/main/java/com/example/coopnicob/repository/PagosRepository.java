package com.example.coopnicob.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.coopnicob.models.Pagos;


@Repository
public interface PagosRepository extends CrudRepository<Pagos, Long> {

}