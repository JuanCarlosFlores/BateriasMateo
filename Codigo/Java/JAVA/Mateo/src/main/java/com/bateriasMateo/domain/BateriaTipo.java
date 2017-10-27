package com.bateriasMateo.domain;



import javax.persistence.*;



@Entity
@Table (name ="bateria_tipo")
public class BateriaTipo {	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Bateria_tipo_id")
	private long bateriaTipoID;
	private String descripcion;
	private String nombre;
	@Column(name="valor_minimo")
	private long valorMinimo;
	
	public long getBateriaTipoID() {
		return bateriaTipoID;
	}
	public void setBateriaTipoID(long bateriaTipoID) {
		this.bateriaTipoID = bateriaTipoID;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getValorMinimo() {
		return valorMinimo;
	}
	public void setValorMinimo(long valorMinimo) {
		this.valorMinimo = valorMinimo;
	}	
	
}
