package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.Libro;
import com.uce.edu.demo.libreria.repository.ILibroRepository;

@Service
@Qualifier("libroE")
public class LibroElectronicoServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public void ingresarLibro(String nombre, String isbm, BigDecimal precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Libro buscarLibro(String isbm) {
		// TODO Auto-generated method stub
		return this.libroRepository.buscar(isbm);
	}

	@Override
	public void actualizarLibro(String nombre, String isbm, BigDecimal precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarLibro(String isbm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal descuentoLibro(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal descuento = precio.multiply(new BigDecimal(55)).divide(new BigDecimal(100));
		return descuento;
	}

}
