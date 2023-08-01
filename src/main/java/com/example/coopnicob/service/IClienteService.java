package com.example.coopnicob.service;

import java.util.List;

import com.example.coopnicob.models.Cliente;

public interface IClienteService {
    public List<Cliente> getClientes();
    public void saveCliente (Cliente cliente);
}
