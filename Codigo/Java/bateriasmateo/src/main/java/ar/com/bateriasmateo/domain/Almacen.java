package ar.com.bateriasmateo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="ALMACEN")
public class Almacen {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	private String nombre;
	private String descripcion;
	private int capacidad;
	@OneToMany(mappedBy="almacen")
	/*@JoinColumn(name="id_almacen", referencedColumnName="ID")*/
	private List<Bateria> baterias;	
	
	public Almacen() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Bateria> getBaterias() {
		return baterias;
	}

	public void setBaterias(List<Bateria> baterias) {
		this.baterias = baterias;
	}

	
	
}
