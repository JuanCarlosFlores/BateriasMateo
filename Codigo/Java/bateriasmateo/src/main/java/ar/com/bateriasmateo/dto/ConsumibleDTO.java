package ar.com.bateriasmateo.dto;

public class ConsumibleDTO {
	
	private long id;
	private String nombre;
	private String detalle;
	private long cantidad;
	private long cantidadMod;
	private long minimo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public long getMinimo() {
		return minimo;
	}
	public void setMinimo(long minimo) {
		this.minimo = minimo;
	}
	public long getCantidadMod() {
		return cantidadMod;
	}
	public void setCantidadMod(long cantidadMod) {
		this.cantidadMod = cantidadMod;
	}
	
	
	
}
