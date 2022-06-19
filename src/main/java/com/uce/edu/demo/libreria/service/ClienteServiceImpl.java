package com.uce.edu.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.Cliente;
import com.uce.edu.demo.libreria.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public void ingresarCliente(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
		
		this.clienteRepository.insertar(cliente);
	}

	@Override
	public Cliente buscarCliente(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscar(cedula);
	}

	@Override
	public void actualizarCliente(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
		
		this.clienteRepository.actualizar(cliente);
	}

	@Override
	public void eliminarCliente(String cedula) {
		// TODO Auto-generated method stub
		
		this.clienteRepository.eliminar(cedula);
		
	}


}
