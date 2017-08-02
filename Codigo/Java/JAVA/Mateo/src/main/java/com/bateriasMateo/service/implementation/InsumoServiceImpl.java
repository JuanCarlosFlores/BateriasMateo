package com.bateriasMateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bateriasMateo.domain.Insumo;
import com.bateriasMateo.repository.InsumoRepository;
import com.bateriasMateo.service.InsumoService;

@Service
public class InsumoServiceImpl implements InsumoService {

	@Autowired 
	private InsumoRepository insumoRepository;
	
	@Override
	public Insumo save(Insumo pInsumo) {
		return insumoRepository.save(pInsumo);
	}

	@Override
	public Insumo update(Insumo pInsumo) {
		return insumoRepository.save(pInsumo);
	}

	@Override
	public void delete(Insumo pInsumo) {
		insumoRepository.delete(pInsumo);
	}

	@Override
	public Insumo get(Long pId) {
		return insumoRepository.findOne(pId);
	}

	@Override
	public List<Insumo> getAll() {
		Iterable <Insumo> source = insumoRepository.findAll();
		List<Insumo> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}

}
