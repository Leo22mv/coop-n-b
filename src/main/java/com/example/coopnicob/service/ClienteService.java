package com.example.coopnicob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coopnicob.models.Cliente;
import com.example.coopnicob.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = (List<Cliente>) clienteRepository.findAll();
        return listaClientes;
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
    
}
