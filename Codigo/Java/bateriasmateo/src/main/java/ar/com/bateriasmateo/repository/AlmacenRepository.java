package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.Almacen;

@Repository
public interface AlmacenRepository extends PagingAndSortingRepository<Almacen, Long>{

}
