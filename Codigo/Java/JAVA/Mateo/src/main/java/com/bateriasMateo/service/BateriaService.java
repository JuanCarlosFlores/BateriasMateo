package com.bateriasMateo.service;

import java.util.List;

import com.bateriasMateo.domain.Bateria;

public interface BateriaService {
	
	public Bateria save(Bateria pBateria);
	
	public Bateria update(Bateria pBateria);
	
	public void delete(Bateria pBateria);
	
	public Bateria get(Long pId);
	
	public List<Bateria> getAll();

}
