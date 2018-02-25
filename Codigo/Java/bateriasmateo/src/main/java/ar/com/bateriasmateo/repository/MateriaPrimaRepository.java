package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.MateriaPrima;

@Repository
public interface MateriaPrimaRepository extends PagingAndSortingRepository<MateriaPrima, Long>{

}
