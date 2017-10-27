package com.bateriasMateo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="bateria")
public class Bateria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long cantidad;
	private String descripcion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Bateria_tipo_id")
	private BateriaTipo bateriaTipo;
	
	public long getCantidad() {
		return cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BateriaTipo getBateriaTipo() {
		return bateriaTipo;
	}
	public void setBateriaTipo(BateriaTipo bateriaTipo) {
		this.bateriaTipo = bateriaTipo;
	}
		

}
