package ar.com.bateriasmateo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="ESTACION_PRODUCTOS")
public abstract class EstacionProductos {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ESTACION_ID")
	private Estacion estacion;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CONSUMIBLE_ID")
	private Consumible consumible;
	
}
