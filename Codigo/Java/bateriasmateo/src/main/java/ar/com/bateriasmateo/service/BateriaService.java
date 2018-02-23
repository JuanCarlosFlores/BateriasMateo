package ar.com.bateriasmateo.service;

import java.util.List;

import ar.com.bateriasmateo.domain.Bateria;

public interface BateriaService {
	public Bateria save(Bateria pBateria);
	public Bateria update(Bateria pBateria);
	public void delete (Bateria pBateria);
	public Bateria getOne (Long pId);
	public List<Bateria> getAll();
	//public List<Bateria> getByAlmacen(Long pAlmacenId);

}
