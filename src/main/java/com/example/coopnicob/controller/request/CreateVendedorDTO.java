package com.example.coopnicob.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateVendedorDTO {
    private String nombre_vendedor;
    private Long dni_vendedor;
    private String direccion;
    private String comision;
    private String rendimiento;
}
