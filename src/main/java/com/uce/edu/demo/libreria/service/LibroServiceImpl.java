package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.Libro;
import com.uce.edu.demo.libreria.repository.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private Libro libro;
	
	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public void ingresarLibro(String nombre, String isbm, BigDecimal precio) {
		// TODO Auto-generated method stub
		this.libro.setIsbm(isbm);
		this.libro.setNombre(nombre);
		this.libro.setPrecio(precio);
		
		this.libroRepository.insertar(this.libro);
		
	}

	@Override
	public Libro buscarLibro(String isbm) {
		// TODO Auto-generated method stub
		return this.libroRepository.buscar(isbm);
	}

	@Override
	public void actualizarLibro(String nombre, String isbm, BigDecimal precio) {
		// TODO Auto-generated method stub
		this.libro.setNombre(nombre);
		this.libro.setIsbm(isbm);
		this.libro.setPrecio(precio);
		
		this.libroRepository.actualizar(libro);
	}

	@Override
	public void eliminarLibro(String isbm) {
		// TODO Auto-generated method stub
		this.libroRepository.eliminar(isbm);
	}

	@Override
	public BigDecimal descuentoLibro(BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
