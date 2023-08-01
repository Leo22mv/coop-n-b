package com.example.coopnicob.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_factura;

    @OneToOne
    @JoinColumn(name = "vendedor_factura")
    private Vendedor vendedor;

    @OneToOne
    @JoinColumn(name = "cliente_factura")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "productos_factura")
    private Producto producto;

    private Long total;
}
