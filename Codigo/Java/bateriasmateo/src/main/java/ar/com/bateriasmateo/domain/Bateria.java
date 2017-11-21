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
@Table (name ="BATERIA")
public class Bateria{
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;	
	
	@Column(name="NRO_LOTE")	
	private int numeroLote;
	
	private boolean reservada;
	private boolean vendida;	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="BATERIA_TIPO_ID")
	private BateriaTipo bateriaTipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ALMACEN_ID")
	private Almacen almacen;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ESTACION_ID")
	private Estacion estacion;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public boolean isVendida() {
		return vendida;
	}

	public void setVendida(boolean vendida) {
		this.vendida = vendida;
	}

	public BateriaTipo getBateriaTipo() {
		return bateriaTipo;
	}

	public void setBateriaTipo(BateriaTipo bateriaTipo) {
		this.bateriaTipo = bateriaTipo;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}	
	
	
}
