package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.Libro;
import com.uce.edu.demo.libreria.repository.ILibroRepository;

@Service
public class FachadoLibroImpl implements IFachadaLibroService{
	
	@Autowired
	@Qualifier("libroF")
	private ILibroService libroServiceF;
	
	@Autowired
	@Qualifier("libroE")
	private ILibroService libroServiceE;
	
	@Autowired
	private ILibroRepository libroRepository;
	
	@Autowired
	private Libro libro;

	@Override
	public BigDecimal descuentoLibro(String isbm) {
		// TODO Auto-generated method stub
		
		this.libro = this.libroRepository.buscar(isbm);
		System.out.println(this.libro);
		BigDecimal descuento = null;
		
		if(this.libro.getTipo().equalsIgnoreCase("Libro fisico")) {
			descuento = libroServiceF.descuentoLibro(this.libro.getPrecio());
		}else if(this.libro.getTipo().equalsIgnoreCase("Libro electronico")) {
			descuento = libroServiceE.descuentoLibro(this.libro.getPrecio());
		}
		
		return descuento;
	}

}
