package com.bateriasMateo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIA_PRIMA")
public class MateriaPrima {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
		
	private String nombre;
	private String detalle;
	private int cantidad;
	private int valorMinimo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getValorMinimo() {
		return valorMinimo;
	}
	public void setValorMinimo(int valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

}
