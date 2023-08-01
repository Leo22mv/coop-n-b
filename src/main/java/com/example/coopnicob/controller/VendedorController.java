package com.example.coopnicob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.coopnicob.controller.request.CreateVendedorDTO;
import com.example.coopnicob.models.Vendedor;
import com.example.coopnicob.service.IVendedorService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
// @CrossOrigin(origins = "https://coop-n.web.app")
public class VendedorController {
    @Autowired
    private IVendedorService ivendedorService;

    @GetMapping ("/vendedores")
    public List<Vendedor> getVendedors() {
        return ivendedorService.getVendedors();
    }

    @PostMapping ("/vendedor")
    public ResponseEntity<?> register(@RequestBody CreateVendedorDTO createVendedorDTO) {
        Vendedor vendedor = Vendedor.builder()
            .nombre_vendedor(createVendedorDTO.getNombre_vendedor())
            .dni_vendedor(createVendedorDTO.getDni_vendedor())
            .direccion(createVendedorDTO.getDireccion())
            .comision(createVendedorDTO.getRendimiento())
            .rendimiento(createVendedorDTO.getRendimiento())
            .build();
        
        ivendedorService.saveVendedor(vendedor);

        return ResponseEntity.ok(vendedor);
    }
}
