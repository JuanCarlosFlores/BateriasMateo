package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.BateriaEstado;
import ar.com.bateriasmateo.repository.BateriaEstadoRepository;
import ar.com.bateriasmateo.service.BateriaEstadoService;

@Service
public class BateriaEstadoServiceImpl implements BateriaEstadoService {
	@Autowired
	BateriaEstadoRepository bateriaEstadoRepository;

	@Override
	public List<BateriaEstado> getAll() {
		Iterable <BateriaEstado> source = bateriaEstadoRepository.findAll();
		List<BateriaEstado> target= new ArrayList<BateriaEstado>();
		source.forEach(target::add);
		return target;
	}

}
