package com.example.coopnicob.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateClienteDTO {
    private String nombre_cliente;
    private Long dni;
    private String direccion;
    private String email;
}
