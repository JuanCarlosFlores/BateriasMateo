package ar.com.bateriasmateo.service;

import java.util.List;

import ar.com.bateriasmateo.domain.BateriaTipo;

public interface BateriaTipoService {

	public BateriaTipo save(BateriaTipo pBateriaTipo);
	public BateriaTipo update(BateriaTipo pBateriaTipo);
	public void delete(BateriaTipo pBateriaTipo);
	public BateriaTipo getOne(Long pId);
	public List<BateriaTipo> getAll();
	public BateriaTipo getByNombre(String pNombre);
}
