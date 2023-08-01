package com.example.coopnicob;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.coopnicob.models.Cliente;
import com.example.coopnicob.models.Vendedor;
import com.example.coopnicob.repository.ClienteRepository;
import com.example.coopnicob.repository.VendedorRepository;

@SpringBootApplication
public class CoopNicoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoopNicoBApplication.class, args);
	}

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	VendedorRepository vendedorRepository;

	@Bean
	CommandLineRunner init() {
		return args -> {
			Cliente cliente = Cliente.builder()
				.nombre_cliente("Pepe Luis")
				.dni(22722777L)
				.direccion("Jacinto rios 222")
				.email("pepe_lios@dato.com")
				.build();

			Cliente cliente2 = Cliente.builder()
				.nombre_cliente("Nina Goitea")
				.dni(9444555L)
				.direccion("Arturo Orgaz 132")
				.email("ninita22@dato.com")
				.build();

			Cliente cliente3 = Cliente.builder()
				.nombre_cliente("Nelson Crespo")
				.dni(12589664L)
				.direccion("Los Aromos 15 1° A")
				.email("nelsito_laT@dato.com")
				.build();

			Cliente cliente4 = Cliente.builder()
				.nombre_cliente("Paolo Chancalay")
				.dni(24569874L)
				.direccion("Mendoza 3030")
				.email("PaoloChan@dato.com")
				.build();

			Cliente cliente5 = Cliente.builder()
				.nombre_cliente("Roolando Bruno Crespin")
				.dni(45889321L)
				.direccion("Gongora 1000")
				.email("Rollo_zumaran@dato.com")
				.build();
				
			clienteRepository.save(cliente);
			clienteRepository.save(cliente2);
			clienteRepository.save(cliente3);
			clienteRepository.save(cliente4);
			clienteRepository.save(cliente5);



			Vendedor vendedor = Vendedor.builder()
				.nombre_vendedor("Lauro Acosta")
				.dni_vendedor(21546879L)
				.direccion("Carcano 78")
				.comision("3%")
				.rendimiento("100%")
				.build();

			Vendedor vendedor2 = Vendedor.builder()
				.nombre_vendedor("Lucas Moyano")
				.dni_vendedor(4588778L)
				.direccion("Rosario 42")
				.comision("3%")
				.rendimiento("90%")
				.build();

			Vendedor vendedor3 = Vendedor.builder()
				.nombre_vendedor("Liliana Corbalan")
				.dni_vendedor(36548912L)
				.direccion("Maracaibo 132")
				.comision("3%")
				.rendimiento("75%")
				.build();

			Vendedor vendedor4 = Vendedor.builder()
				.nombre_vendedor("Nahuel Rivera")
				.dni_vendedor(39302587L)
				.direccion("Dean Funes 12")
				.comision("3%")
				.rendimiento("85%")
				.build();

			Vendedor vendedor5 = Vendedor.builder()
				.nombre_vendedor("Natali Verdun")
				.dni_vendedor(4087963L)
				.direccion("Mendoza 2058")
				.comision("3%")
				.rendimiento("100%")
				.build();

			vendedorRepository.save(vendedor);
			vendedorRepository.save(vendedor2);
			vendedorRepository.save(vendedor3);
			vendedorRepository.save(vendedor4);
			vendedorRepository.save(vendedor5);
		};
	}
}
