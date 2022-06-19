package com.uce.edu.demo.libreria.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.Libro;

@Repository
public class LibroRepositoryImpl implements ILibroRepository {

	@Override
	public void insertar(Libro l) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso el libro: " + l);
	}

	@Override
	public Libro buscar(String isbm) {
		// TODO Auto-generated method stub
		Libro libro = new Libro();
		libro.setIsbm(isbm);
		libro.setTipo("Libro electronico");
		libro.setNombre("El señor de los anillos");
		libro.setPrecio(new BigDecimal(10));
		return libro;
	}

	@Override
	public void actualizar(Libro l) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el libro: " + l);
	}

	@Override
	public void eliminar(String isbm) {
		// TODO Auto-generated method stub
		System.out.println("El libro con el ISBM: " + isbm + " fue eliminado.");
	}

}
