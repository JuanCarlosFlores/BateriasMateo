package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.Insumo;

import ar.com.bateriasmateo.repository.InsumoRepository;
import ar.com.bateriasmateo.service.InsumoService;

@Service
public class InsumoServiceImpl implements InsumoService{
	
	@Autowired
	private InsumoRepository InsumoRepository;

	@Override
	public Insumo save(Insumo pInsumo) {
	
		return InsumoRepository.save(pInsumo);
	}

	@Override
	public Insumo update(Insumo pInsumo) {
		return InsumoRepository.save(pInsumo);
	}

	@Override
	public void delete(Insumo pInsumo) {
		InsumoRepository.delete(pInsumo);
		
	}

	@Override
	public Insumo getOne(Long pId) {		
		return InsumoRepository.findOne(pId);
	}

	@Override
	public List<Insumo> getAll() {
		Iterable<Insumo> source = InsumoRepository.findAll();
		List<Insumo> target = new ArrayList<Insumo>();
		source.forEach(target::add);
		return target;
	}
}
