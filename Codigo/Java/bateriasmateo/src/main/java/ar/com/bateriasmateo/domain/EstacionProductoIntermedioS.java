package ar.com.bateriasmateo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@DiscriminatorValue( value="SALIDA" )
public class EstacionProductoIntermedioS {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PRODUCTO_INTERMEDIO_ID")
	private ProductoIntermedio productoIntermedio;
}
