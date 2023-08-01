package com.example.coopnicob.service;

import java.util.List;

import com.example.coopnicob.models.Vendedor;

public interface IVendedorService {
    public List<Vendedor> getVendedors();
    public void saveVendedor (Vendedor vendedor);
}
