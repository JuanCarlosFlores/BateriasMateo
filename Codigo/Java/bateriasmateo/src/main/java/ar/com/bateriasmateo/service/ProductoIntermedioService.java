package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.ProductoIntermedio;

public interface ProductoIntermedioService {

	public ProductoIntermedio save(ProductoIntermedio pProductoIntermedio);
	public ProductoIntermedio update(ProductoIntermedio pProductoIntermedio);
	public void delete (ProductoIntermedio pProductoIntermedio);
	public ProductoIntermedio getOne (Long pId);
	public List<ProductoIntermedio> getAll();
}
