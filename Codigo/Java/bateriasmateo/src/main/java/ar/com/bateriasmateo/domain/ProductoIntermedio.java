package ar.com.bateriasmateo.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue( value="PI" )
public class ProductoIntermedio extends Consumible{
		
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ESTACION_ID")
	private Estacion estacion;	
	
	public ProductoIntermedio() {
		super();
	}


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
