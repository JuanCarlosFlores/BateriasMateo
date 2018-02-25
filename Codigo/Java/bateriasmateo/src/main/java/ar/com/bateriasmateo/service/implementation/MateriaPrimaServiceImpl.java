package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.MateriaPrima;

import ar.com.bateriasmateo.repository.MateriaPrimaRepository;
import ar.com.bateriasmateo.service.MateriaPrimaService;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService{
	
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
	public MateriaPrima getOne(Long pId) {		
		return MateriaPrimaRepository.findOne(pId);
	}

	@Override
	public List<MateriaPrima> getAll() {
		Iterable<MateriaPrima> source = MateriaPrimaRepository.findAll();
		List<MateriaPrima> target = new ArrayList<MateriaPrima>();
		source.forEach(target::add);
		return target;
	}
}
