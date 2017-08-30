package com.bateriasMateo.service;

import java.util.List;

import com.bateriasMateo.domain.BateriaTipo;

public interface BateriaTipoService {

	public BateriaTipo save(BateriaTipo pBateriaTipo);
	public BateriaTipo update(BateriaTipo pBateriaTipo);
	public void delete (BateriaTipo pBateriaTipo);
	public BateriaTipo get(Long pId);
	public List<BateriaTipo> getAll();
}
