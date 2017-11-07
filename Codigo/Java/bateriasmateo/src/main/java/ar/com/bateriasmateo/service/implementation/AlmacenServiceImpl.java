package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.Almacen;
import ar.com.bateriasmateo.repository.AlmacenRepository;
import ar.com.bateriasmateo.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService{

	@Autowired
	AlmacenRepository almacenRepository;
	@Override
	public Almacen save(Almacen pAlmacen) {
		return almacenRepository.save(pAlmacen);
	}

	@Override
	public Almacen update(Almacen pAlmacen) {
		return almacenRepository.save(pAlmacen);
	}

	@Override
	public void delete(Almacen pAlmacen) {
		almacenRepository.delete(pAlmacen);
		
	}

	@Override
	public Almacen getOne(Long pId) {
		
		return almacenRepository.findOne(pId);
	}

	@Override
	public List<Almacen> getAll() {
		Iterable <Almacen> source= almacenRepository.findAll();
		List <Almacen> target = new ArrayList<Almacen>();
		source.forEach(target::add);
		return target;
	}

}
