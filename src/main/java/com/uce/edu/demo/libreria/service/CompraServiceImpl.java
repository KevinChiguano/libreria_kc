package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.Cliente;
import com.uce.edu.demo.libreria.modelo.Compra;
import com.uce.edu.demo.libreria.modelo.Libro;
import com.uce.edu.demo.libreria.repository.ICompraRepository;

@Service
public class CompraServiceImpl implements ICompraService{

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	@Qualifier("libroF")
	private ILibroService libroService;
	
	@Autowired
	private ICompraRepository compraRepository;
	
	@Autowired
	private Libro libro;
	
	@Autowired 
	private Compra compra;
	
	@Override
	public Compra realizarCompra(String cedula, String isbm, LocalDateTime fechaCompra) {
		// TODO Auto-generated method stub
		
		this.libro = this.libroService.buscarLibro(isbm);
		
		
		this.compra.setCedula(cedula);
		this.compra.setFechaCompra(fechaCompra);
		this.compra.setIsbm(isbm);
		this.compra.setMonto(this.libro.getPrecio());
		
		return compra;
	}

	@Override
	public List<Compra> buscarCompra(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		return this.compraRepository.buscar(fechaInicio);
	}

	@Override
	public void cambiarCompra(LocalDateTime fechaCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolverCompra(LocalDateTime fechaDevolucion) {
		// TODO Auto-generated method stub
		
	}



}
