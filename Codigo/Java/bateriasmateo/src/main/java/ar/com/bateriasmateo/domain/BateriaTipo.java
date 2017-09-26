package ar.com.bateriasmateo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="BATERIA_TIPO")
public class BateriaTipo {
	
		@Id	
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="ID")
		private long id;
		
		private String nombre;		
		private String descripcion;
		
		
		
		public BateriaTipo() {
			super();
		}
		
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
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		

	
}
