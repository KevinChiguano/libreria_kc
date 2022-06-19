package com.uce.edu.demo.libreria.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Libro {

	private String nombre;
	private BigDecimal precio;
	private String isbm;
	private String tipo;

	
	

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", precio=" + precio + ", isbm=" + isbm + ", tipo=" + tipo + "]";
	}

	//SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getIsbm() {
		return isbm;
	}

	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
