package ar.com.bateriasmateo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@DiscriminatorValue( value="ENTRADA" )
public class EstacionInsumo extends EstacionProductos{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="INSUMO_ID")
	private Insumo insumo;
}
