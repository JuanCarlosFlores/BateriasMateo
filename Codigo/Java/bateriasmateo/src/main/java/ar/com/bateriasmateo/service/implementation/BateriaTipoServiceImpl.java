package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.BateriaTipo;

import ar.com.bateriasmateo.repository.BateriaTipoRepository;
import ar.com.bateriasmateo.service.BateriaTipoService;

@Service
public class BateriaTipoServiceImpl implements BateriaTipoService{
	
	@Autowired
	private BateriaTipoRepository bateriaTipoRepository;

	@Override
	public BateriaTipo save(BateriaTipo pBateriaTipo) {
	
		return bateriaTipoRepository.save(pBateriaTipo);
	}

	@Override
	public BateriaTipo update(BateriaTipo pBateriaTipo) {
		return bateriaTipoRepository.save(pBateriaTipo);
	}

	@Override
	public void delete(BateriaTipo pBateriaTipo) {
		bateriaTipoRepository.delete(pBateriaTipo);
		
	}

	@Override
	public BateriaTipo getOne(Long pId) {		
		return bateriaTipoRepository.findOne(pId);
	}

	@Override
	public List<BateriaTipo> getAll() {
		Iterable<BateriaTipo> source = bateriaTipoRepository.findAll();
		List<BateriaTipo> target = new ArrayList<BateriaTipo>();
		source.forEach(target::add);
		return target;
	}

}
