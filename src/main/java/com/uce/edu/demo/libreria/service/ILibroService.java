package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;

import com.uce.edu.demo.libreria.modelo.Libro;

public interface ILibroService {

	public void ingresarLibro(String nombre, String isbm, BigDecimal precio);

	public Libro buscarLibro(String isbm);

	public void actualizarLibro(String nombre, String isbm, BigDecimal precio);

	public void eliminarLibro(String isbm);
	
	public BigDecimal descuentoLibro(BigDecimal precio);

}
