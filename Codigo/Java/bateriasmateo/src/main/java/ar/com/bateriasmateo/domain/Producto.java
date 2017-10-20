package ar.com.bateriasmateo.domain;

import javax.persistence.Entity;

@Entity
public interface Producto {
	
	
	public void consumir (int cantidad);
	public int verDisponibilidad ();
}
