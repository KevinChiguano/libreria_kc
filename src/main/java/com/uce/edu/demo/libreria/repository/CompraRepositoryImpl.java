package com.uce.edu.demo.libreria.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.Compra;

@Repository
public class CompraRepositoryImpl implements ICompraRepository{

	@Override
	public void insertar(Compra c) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso la compra: "+c);
	}

	@Override
	public List<Compra> buscar(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		List<Compra> compras = new ArrayList<>();
		
		Compra compra1 = new Compra();
		compra1.setCedula("123456789");
		compra1.setFechaCompra(fechaInicio);
		compra1.setIsbm("0-7645-2641-3");
		compra1.setMonto(new BigDecimal(10));
		
		Compra compra2 = new Compra();
		compra2.setCedula("987654123");
		compra2.setFechaCompra(fechaInicio);
		compra2.setIsbm("978-3-16-148410-0");
		compra2.setMonto(new BigDecimal(40));
		
		compras.add(compra1);
		compras.add(compra2);
		
		return compras;
	}

	@Override
	public void actualizar(Compra c) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo la compra: "+c);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la compra de la persona con cedula: "+cedula);
	}

}
