package ar.com.bateriasmateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bateriasmateo.domain.ProductoIntermedio;

import ar.com.bateriasmateo.repository.ProductoIntermedioRepository;
import ar.com.bateriasmateo.service.ProductoIntermedioService;

@Service
public class ProductoIntermedioServiceImpl implements ProductoIntermedioService{
	
	@Autowired
	private ProductoIntermedioRepository ProductoIntermedioRepository;

	@Override
	public ProductoIntermedio save(ProductoIntermedio pProductoIntermedio) {
	
		return ProductoIntermedioRepository.save(pProductoIntermedio);
	}

	@Override
	public ProductoIntermedio update(ProductoIntermedio pProductoIntermedio) {
		return ProductoIntermedioRepository.save(pProductoIntermedio);
	}

	@Override
	public void delete(ProductoIntermedio pProductoIntermedio) {
		ProductoIntermedioRepository.delete(pProductoIntermedio);
		
	}

	@Override
	public ProductoIntermedio getOne(Long pId) {		
		return ProductoIntermedioRepository.findOne(pId);
	}

	@Override
	public List<ProductoIntermedio> getAll() {
		Iterable<ProductoIntermedio> source = ProductoIntermedioRepository.findAll();
		List<ProductoIntermedio> target = new ArrayList<ProductoIntermedio>();
		source.forEach(target::add);
		return target;
	}
}
