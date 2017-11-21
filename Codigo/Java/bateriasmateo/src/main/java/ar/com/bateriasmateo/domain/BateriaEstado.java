package ar.com.bateriasmateo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bateria_estado")
public class BateriaEstado {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BATERIA_ESTADO_ID")
	private long bateriaEstadoId;
	private String nombre;
	private String descripcion;
	public long getId() {
		return bateriaEstadoId;
	}
	public void setId(long bateriaEstadoId) {
		this.bateriaEstadoId = bateriaEstadoId;
	}
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
