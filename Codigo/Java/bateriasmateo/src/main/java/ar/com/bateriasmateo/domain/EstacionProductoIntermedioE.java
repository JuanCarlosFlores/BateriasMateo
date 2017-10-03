package ar.com.bateriasmateo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue( value="ENTRADA" )
public class EstacionProductoIntermedioE extends EstacionProductos {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PRODUCTO_INTERMEDIO_ID")
	private ProductoIntermedio productoIntermedio;
}
