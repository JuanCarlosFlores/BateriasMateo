package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.Insumo;

@Repository
public interface InsumoRepository extends PagingAndSortingRepository<Insumo, Long>{

}
