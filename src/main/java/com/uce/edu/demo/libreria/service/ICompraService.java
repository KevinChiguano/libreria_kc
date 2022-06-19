package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.libreria.modelo.Compra;

public interface ICompraService {

	public Compra realizarCompra(String cedula, String isbm, LocalDateTime fechaCompra);

	public List<Compra> buscarCompra(LocalDateTime fechaInicio);

	public void cambiarCompra(LocalDateTime fechaCambio);

	public void devolverCompra(LocalDateTime fechaDevolucion);
}
