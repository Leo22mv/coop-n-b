package com.example.coopnicob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coopnicob.models.Vendedor;
import com.example.coopnicob.repository.ClienteRepository;
import com.example.coopnicob.repository.VendedorRepository;

@Service
public class VendedorService implements IVendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    @Override
    public List<Vendedor> getVendedors() {
        List<Vendedor> listaVendedors = (List<Vendedor>) vendedorRepository.findAll();
        return listaVendedors;
    }

    @Override
    public void saveVendedor(Vendedor vendedor) {
        vendedorRepository.save(vendedor);
    }
    
}
