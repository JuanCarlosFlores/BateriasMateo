package com.bateriasMateo.service;

import java.util.List;

import com.bateriasMateo.domain.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima save(MateriaPrima pMateriaPrima);

	public MateriaPrima update(MateriaPrima pMateriaPrima);

	public void delete(MateriaPrima pMateriaPrima);

	public MateriaPrima get(Long pId);

	public List<MateriaPrima> getAll();
}
