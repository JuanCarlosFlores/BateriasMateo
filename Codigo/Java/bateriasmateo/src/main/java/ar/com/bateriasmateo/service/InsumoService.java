package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.Insumo;

public interface InsumoService {

	public Insumo save(Insumo pInsumo);
	public Insumo update(Insumo pInsumo);
	public void delete (Insumo pInsumo);
	public Insumo getOne (Long pId);
	public List<Insumo> getAll();
}
