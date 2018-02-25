package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.ProductoIntermedio;

@Repository
public interface ProductoIntermedioRepository extends PagingAndSortingRepository<ProductoIntermedio, Long>{

}
