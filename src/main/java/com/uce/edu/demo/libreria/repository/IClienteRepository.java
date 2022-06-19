package com.uce.edu.demo.libreria.repository;

import com.uce.edu.demo.libreria.modelo.Cliente;

public interface IClienteRepository {

	public void insertar(Cliente c);

	public Cliente buscar(String cedula);

	public void actualizar(Cliente c);

	public void eliminar(String cedula);

}
