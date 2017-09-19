package com.bateriasMateo.domain;

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
@Table (name ="estacion_producto")
public class EstacionProductos {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="estacion_id")
	private Estacion estacion;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="materia_prima_id")
	private MateriaPrima materiaPrima;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="insumo_id")
	private Insumo insumo_id;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="producto_intermedio_id")
	private ProductoIntermedio ProductoIntermedio;	
	
	// ENTRADA - SALIDA
	@Column(name="tipo_realacion")
	private String tipoRelacion;

	public EstacionProductos() {
		super();
	}	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public Insumo getInsumo_id() {
		return insumo_id;
	}

	public void setInsumo_id(Insumo insumo_id) {
		this.insumo_id = insumo_id;
	}

	public ProductoIntermedio getProductoIntermedio() {
		return ProductoIntermedio;
	}

	public void setProductoIntermedio(ProductoIntermedio productoIntermedio) {
		ProductoIntermedio = productoIntermedio;
	}

	public String getTipoRelacion() {
		return tipoRelacion;
	}

	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}


	
}
