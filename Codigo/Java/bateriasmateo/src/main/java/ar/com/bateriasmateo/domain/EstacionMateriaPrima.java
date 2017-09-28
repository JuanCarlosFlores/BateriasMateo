package ar.com.bateriasmateo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@DiscriminatorValue( value="ENTRADA" )
public class EstacionMateriaPrima extends EstacionProductos{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="MATERIA_PRIMA_ID")
	private MateriaPrima MateriaPrima;
}
