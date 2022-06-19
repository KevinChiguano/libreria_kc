package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.libreria.service.ICompraService;
import com.uce.edu.demo.libreria.service.IFachadaLibroService;

@SpringBootApplication
public class LibreriaKcApplication implements CommandLineRunner{
	
	@Autowired
	private ICompraService compraService;
	
	@Autowired
	private IFachadaLibroService fachadaLibroService;

	public static void main(String[] args) {
		SpringApplication.run(LibreriaKcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.out.println(this.compraService.realizarCompra("123456789", "978-3-16-148410-0", LocalDateTime.now()));
		System.out.println("Tiene un descuento de: "+ fachadaLibroService.descuentoLibro("978-3-16-148410-0"));
	}

}
