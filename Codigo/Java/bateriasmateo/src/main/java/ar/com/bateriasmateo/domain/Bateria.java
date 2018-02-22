package ar.com.bateriasmateo.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table (name ="BATERIA")
public class Bateria{
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_bateria")
	private long id;	
	
	@Column(name="NRO_LOTE")	
	private String numeroLote;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CREACION", nullable = false, insertable = true, updatable = false)
	private Date fechaCreacion;	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="BATERIA_TIPO_ID")
	private BateriaTipo bateriaTipo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="BATERIA_ESTADO_ID")
	private BateriaEstado bateriaEstado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ALMACEN_ID")
	private Almacen almacen;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ESTACION_ID")
	private Estacion estacion;
	
	public Bateria (){				
		this.fechaCreacion= new Date();
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
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

	public BateriaEstado getBateriaEstado() {
		return bateriaEstado;
	}

	public void setBateriaEstado(BateriaEstado bateriaEstado) {
		this.bateriaEstado = bateriaEstado;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
