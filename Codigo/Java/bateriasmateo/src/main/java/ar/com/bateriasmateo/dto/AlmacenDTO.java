package ar.com.bateriasmateo.dto;

import java.util.ArrayList;

public class AlmacenDTO {
	private String nombre;
	private String descripcion;
	private int capacidad;
	private ArrayList<BateriaAlmacenDTO> baterias;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<BateriaAlmacenDTO> getBaterias() {
		return baterias;
	}
	public void setBaterias(ArrayList<BateriaAlmacenDTO> baterias) {
		this.baterias = baterias;
	}
	
}
