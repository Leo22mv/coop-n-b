package com.example.coopnicob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.coopnicob.controller.request.CreateClienteDTO;
import com.example.coopnicob.models.Cliente;
import com.example.coopnicob.service.IClienteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
    
    @Autowired
    private IClienteService iclienteService;

    @GetMapping ("/clientes")
    public List<Cliente> getClientes() {
        return iclienteService.getClientes();
    }

    @PostMapping ("/cliente")
    public ResponseEntity<?> register(@RequestBody CreateClienteDTO createClienteDTO) {
        Cliente cliente = Cliente.builder()
            .nombre_cliente(createClienteDTO.getNombre_cliente())
            .dni(createClienteDTO.getDni())
            .direccion(createClienteDTO.getDireccion())
            .email(createClienteDTO.getEmail())
            .build();
        
        iclienteService.saveCliente(cliente);

        return ResponseEntity.ok(cliente);
    }
}
