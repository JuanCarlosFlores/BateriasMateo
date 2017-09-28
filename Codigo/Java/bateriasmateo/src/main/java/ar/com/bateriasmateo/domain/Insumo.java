package ar.com.bateriasmateo.domain;


import javax.persistence.Entity;

@Entity
public class Insumo extends Consumible {

	@Override
	public void consumir(int cantidad) {
		// TODO Auto-generated method stub		
	}
	@Override
	public int verDisponibilidad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
