package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.Almacen;
import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.domain.BateriaTipo;
import ar.com.bateriasmateo.dto.AlmacenDTO;
import ar.com.bateriasmateo.dto.BateriaAlmacenDTO;
import ar.com.bateriasmateo.repository.AlmacenRepository;
import ar.com.bateriasmateo.repository.BateriaTipoRepository;
import ar.com.bateriasmateo.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService{

	
	BateriaAlmacenDTO bateriaView;
	@Autowired
	AlmacenRepository almacenRepository;
	@Autowired
	BateriaTipoRepository bateriaTipoRepository;
	int cantidadAux=0;
	
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

	@Override
	public AlmacenDTO getViewAlmacenDTO(Almacen almacen) {		
		AlmacenDTO almacenView = new AlmacenDTO();
		almacenView.setId(almacen.getId());
		almacenView.setNombre(almacen.getNombre());
		almacenView.setDescripcion(almacen.getDescripcion());
		almacenView.setCapacidad(almacen.getCapacidad());
		almacenView.setCantidad(almacen.getBaterias().size());
		Iterable<BateriaTipo> tipos = bateriaTipoRepository.findAll();
		Iterable<Bateria> baterias = almacen.getBaterias();
		ArrayList<BateriaAlmacenDTO> bateriasView =new ArrayList<BateriaAlmacenDTO>();
		for (BateriaTipo tipo : tipos) {
			bateriaView = new BateriaAlmacenDTO();			
			for (Bateria bateria : baterias) {
				if(tipo.getId()==bateria.getBateriaTipo().getId()){
					cantidadAux=cantidadAux+1;
				}
			}
			if(cantidadAux>0){
				bateriaView.setTipoBateria(tipo.getNombre());
				bateriaView.setCantidad(cantidadAux);
				cantidadAux=0;
				bateriasView.add(bateriaView);
			}
		}
		
		almacenView.setBaterias(bateriasView);
		
	
		return almacenView;
	}
	

}
