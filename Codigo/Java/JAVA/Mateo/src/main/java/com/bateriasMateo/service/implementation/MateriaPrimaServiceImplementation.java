package com.bateriasMateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bateriasMateo.domain.Bateria;
import com.bateriasMateo.domain.MateriaPrima;
import com.bateriasMateo.repository.MateriaPrimaRepository;
import com.bateriasMateo.service.MateriaPrimaService;

@Service
public class MateriaPrimaServiceImplementation implements MateriaPrimaService {

	@Autowired
	private MateriaPrimaRepository MateriaPrimaRepository;

	@Override
	public MateriaPrima save(MateriaPrima pMateriaPrima) {
		return MateriaPrimaRepository.save(pMateriaPrima);
	}

	@Override
	public MateriaPrima update(MateriaPrima pMateriaPrima) {
		return MateriaPrimaRepository.save(pMateriaPrima);
	}

	@Override
	public void delete(MateriaPrima pMateriaPrima) {
		MateriaPrimaRepository.delete(pMateriaPrima);
	}

	@Override
	public MateriaPrima get(Long pId) {
		return MateriaPrimaRepository.findOne(pId);
	}

	@Override
	public List<MateriaPrima> getAll() {
		Iterable<MateriaPrima> source = MateriaPrimaRepository.findAll();
		List<MateriaPrima> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}

}
