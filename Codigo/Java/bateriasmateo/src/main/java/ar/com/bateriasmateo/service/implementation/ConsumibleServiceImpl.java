package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.bateriasmateo.domain.Consumible;
import ar.com.bateriasmateo.domain.Insumo;
import ar.com.bateriasmateo.domain.MateriaPrima;
import ar.com.bateriasmateo.domain.ProductoIntermedio;
import ar.com.bateriasmateo.repository.InsumoRepository;
import ar.com.bateriasmateo.repository.MateriaPrimaRepository;
import ar.com.bateriasmateo.repository.ProductoIntermedioRepository;
import ar.com.bateriasmateo.service.ConsumibleService;
import ar.com.bateriasmateo.dto.ConsumibleDTO;

@Service
public class ConsumibleServiceImpl implements ConsumibleService{
	
	@Autowired
	private InsumoRepository InsumoRepository;
	@Autowired
	private MateriaPrimaRepository MateriaPrimaRepository;
	@Autowired
	private ProductoIntermedioRepository ProductoIntermedioRepository;

	@Override
	public Consumible getOne(Long pId) {		

	if(MateriaPrimaRepository.findOne(pId) == null){
			if(InsumoRepository.findOne(pId) == null){
					return ProductoIntermedioRepository.findOne(pId);					
							
			}else{
				return InsumoRepository.findOne(pId);
			}		
		}
		return MateriaPrimaRepository.findOne(pId);
	}

	@Override
	public List<Consumible> getAll() {
		List<Consumible> target = new ArrayList<Consumible>();			
		target.addAll( (Collection<? extends Consumible>) MateriaPrimaRepository.findAll());		
		target.addAll( (Collection<? extends Consumible>) ProductoIntermedioRepository.findAll());
		target.addAll( (Collection<? extends Consumible>) InsumoRepository.findAll());
		return target;
	}
	
	@Override
	public ConsumibleDTO getViewConsumibleDTO(Long pId) {		
		
	ConsumibleDTO consumibleDTO = new ConsumibleDTO();
	
	if(MateriaPrimaRepository.findOne(pId) == null){
			if(InsumoRepository.findOne(pId) == null){
					 consumibleDTO.setId(ProductoIntermedioRepository.findOne(pId).getId());
					 consumibleDTO.setCantidad(ProductoIntermedioRepository.findOne(pId).getCantidad());
					 consumibleDTO.setNombre(ProductoIntermedioRepository.findOne(pId).getNombre());
					 consumibleDTO.setMinimo(ProductoIntermedioRepository.findOne(pId).getMinimo());
					 return consumibleDTO;
			}else{
				consumibleDTO.setId(InsumoRepository.findOne(pId).getId());
				consumibleDTO.setCantidad(InsumoRepository.findOne(pId).getCantidad());
				consumibleDTO.setNombre(InsumoRepository.findOne(pId).getNombre());
				consumibleDTO.setMinimo(InsumoRepository.findOne(pId).getMinimo());
				return consumibleDTO;
			}		
		}
		consumibleDTO.setId(MateriaPrimaRepository.findOne(pId).getId());
		consumibleDTO.setCantidad(MateriaPrimaRepository.findOne(pId).getCantidad());
		consumibleDTO.setNombre(MateriaPrimaRepository.findOne(pId).getNombre());
		consumibleDTO.setMinimo(MateriaPrimaRepository.findOne(pId).getMinimo());
		return consumibleDTO;
	}
	
	@Override
	public Consumible consumir(ConsumibleDTO pConsumibleDTO) {

		if(MateriaPrimaRepository.findOne(pConsumibleDTO.getId()) == null){
			if(InsumoRepository.findOne(pConsumibleDTO.getId()) == null){			
					ProductoIntermedio target = ProductoIntermedioRepository.findOne(pConsumibleDTO.getId());	
				    target.setCantidad(target.getCantidad() - pConsumibleDTO.getCantidadMod());
				    return ProductoIntermedioRepository.save(target);						
			}else{
				Insumo target = InsumoRepository.findOne(pConsumibleDTO.getId());
				target.setCantidad(target.getCantidad() - pConsumibleDTO.getCantidadMod());
				return InsumoRepository.save(target);
			}		
		}		
		MateriaPrima target = MateriaPrimaRepository.findOne(pConsumibleDTO.getId());
	    target.setCantidad(target.getCantidad() - pConsumibleDTO.getCantidadMod());
	    return MateriaPrimaRepository.save(target);
	  	  			
		
	}
	
}
