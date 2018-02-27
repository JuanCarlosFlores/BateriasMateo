package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.Consumible;
import ar.com.bateriasmateo.dto.ConsumibleDTO;

public interface ConsumibleService {

	public Consumible getOne (Long pId);
	public List<Consumible> getAll();
	public ConsumibleDTO getViewConsumibleDTO(Long pId);
	public Consumible consumir(ConsumibleDTO pConsumibleDTO);
}
