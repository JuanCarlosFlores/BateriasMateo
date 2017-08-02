package com.bateriasMateo.service;

import java.util.List;

import com.bateriasMateo.domain.Insumo;

public interface InsumoService {

	public Insumo save(Insumo pInsumo);
	
	public Insumo update(Insumo pInsumo);
	
	public void delete(Insumo pInsumo);
	
	public Insumo get(Long pId);
	
	public List<Insumo> getAll();

}
