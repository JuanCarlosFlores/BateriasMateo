package ar.com.bateriasmateo.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue( value="SALIDA" )
public class EstacionProductoIntermedioS extends EstacionProductos{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PRODUCTO_INTERMEDIO_ID")
	private ProductoIntermedio productoIntermedio;
}
