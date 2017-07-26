package com.bateriasMateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bateriasMateo.domain.Bateria;
import com.bateriasMateo.repository.BateriaRepository;
import com.bateriasMateo.service.BateriaService;

@Service
public class BateriaServiceImpl implements BateriaService {

	@Autowired
	private BateriaRepository bateriaRepository;
	
	@Override
	public Bateria save(Bateria pBateria) {
		return bateriaRepository.save(pBateria);
	}

	@Override
	public Bateria update(Bateria pBateria) {
		return bateriaRepository.save(pBateria);
	}

	@Override
	public void delete(Bateria pBateria) {
		bateriaRepository.delete(pBateria);
		
	}

	@Override
	public Bateria get(Long pId) {		
		return bateriaRepository.findOne(pId);
	}

	@Override
	public List<Bateria> getAll() {	
		Iterable <Bateria> source = bateriaRepository.findAll();
		List<Bateria> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}

}
