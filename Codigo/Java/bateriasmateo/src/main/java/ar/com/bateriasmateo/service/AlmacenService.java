package ar.com.bateriasmateo.service;

import java.util.List;

import ar.com.bateriasmateo.domain.Almacen;
import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.dto.AlmacenDTO;
import ar.com.bateriasmateo.dto.BateriaAlmacenDTO;

public interface AlmacenService {
	public Almacen save(Almacen pAlmacen);
	public Almacen update(Almacen pAlmacen);
	public void delete(Almacen pAlmacen);
	public Almacen getOne(Long pId);
	public List<Almacen> getAll();
	public AlmacenDTO getViewAlmacenDTO(Almacen almacen);
	
	
}
