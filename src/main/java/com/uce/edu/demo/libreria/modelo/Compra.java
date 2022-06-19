package com.uce.edu.demo.libreria.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Compra {

	private String isbm;
	private String cedula;
	private BigDecimal monto;
	private LocalDateTime fechaCompra;

	@Override
	public String toString() {
		return "Compra [isbm=" + isbm + ", cedula=" + cedula + ", monto=" + monto + ", fechaCompra=" + fechaCompra
				+ "]";
	}

	// SET y GET
	public String getIsbm() {
		return isbm;
	}

	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	

}
