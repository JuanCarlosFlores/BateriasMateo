package ar.com.bateriasmateo.dto;

public class BateriaAlmacenDTO {
	private String tipoBateria;
	private long cantidad;
	
	public BateriaAlmacenDTO(){
		this.tipoBateria="";
		this.cantidad=0;
		
	}
	public String getTipoBateria() {
		return tipoBateria;
	}
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

}
