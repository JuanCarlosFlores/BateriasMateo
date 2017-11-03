package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.Estacion;


public interface EstacionService {

	public Estacion save(Estacion pEstacion);
	
	public Estacion update(Estacion pEstacion);
	
	public void delete(Estacion pEstacion);
	
	public Estacion get(Long pId);
	
	public List<Estacion> getAll();
}
