package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima save(MateriaPrima pMateriaPrima);
	public MateriaPrima update(MateriaPrima pMateriaPrima);
	public void delete (MateriaPrima pMateriaPrima);
	public MateriaPrima getOne (Long pId);
	public List<MateriaPrima> getAll();
}
