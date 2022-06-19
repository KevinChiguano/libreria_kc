package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.modelo.Cliente;

public interface IClienteService {

	public void ingresarCliente(String nombre, String apellido,String cedula);

	public Cliente buscarCliente(String cedula);

	public void actualizarCliente(String nombre, String apellido,String cedula);

	public void eliminarCliente(String cedula);
}
