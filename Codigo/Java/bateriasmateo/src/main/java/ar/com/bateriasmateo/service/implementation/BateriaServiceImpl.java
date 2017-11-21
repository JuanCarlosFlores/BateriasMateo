package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.repository.BateriaRepository;
import ar.com.bateriasmateo.service.BateriaService;

@Service
public class BateriaServiceImpl implements BateriaService{

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
	public Bateria getOne(Long pId) {
		return bateriaRepository.findOne(pId);
	}

	@Override
	public List<Bateria> getAll() {	
		Iterable <Bateria> source = bateriaRepository.findAll();
		List <Bateria> target = new ArrayList<Bateria>();
		source.forEach(target::add);
		return target;
	}

	@Override
	public List<Bateria> getByAlmacen(Long pId) {
		Iterable <Bateria> source = bateriaRepository.findAll();
		List<Bateria> target = new ArrayList<Bateria>();
		for (Bateria bateria:source){
			if(bateria.getAlmacen().getId()==pId){
				target.add(bateria);
			}			
		}
		return target;
	}

}
