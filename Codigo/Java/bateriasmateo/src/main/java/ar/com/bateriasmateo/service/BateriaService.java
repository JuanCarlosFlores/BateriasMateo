package ar.com.bateriasmateo.service;

import java.util.List;

import ar.com.bateriasmateo.domain.Almacen;
import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.domain.BateriaTipo;

public interface BateriaService {
	public Bateria save(Bateria pBateria);
	public Bateria update(Bateria pBateria);
	public void delete (Bateria pBateria);
	public Bateria getOne (Long pId);
	public List<Bateria> getAll();
	public List<Bateria> getByAlmacen(Almacen pAlmacen);
	public List<Bateria> getByAlmacenAndBateriaTipo(Almacen pAlmacen, BateriaTipo pBateriaTipo);


}
