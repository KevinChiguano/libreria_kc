package com.uce.edu.demo.libreria.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.libreria.modelo.Compra;

public interface ICompraRepository {

	public void insertar(Compra c);

	public List<Compra> buscar(LocalDateTime fechaInicio);

	public void actualizar(Compra c);

	public void eliminar(String cedula);

}
