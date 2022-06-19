package com.uce.edu.demo.libreria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	@Override
	public void insertar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el cliente: " + c);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNombre("Kevin");
		cliente.setApellido("Arguello");
		cliente.setCedula(cedula);
		return cliente;
	}

	@Override
	public void actualizar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el cliente: " + c);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Cliente con la cedula " + cedula + " eliminado.");
	}

}
