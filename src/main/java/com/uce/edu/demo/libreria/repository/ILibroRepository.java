package com.uce.edu.demo.libreria.repository;

import com.uce.edu.demo.libreria.modelo.Libro;

public interface ILibroRepository {

	public void insertar(Libro l);

	public Libro buscar(String isbm);

	public void actualizar(Libro l);

	public void eliminar(String isbm);
}
