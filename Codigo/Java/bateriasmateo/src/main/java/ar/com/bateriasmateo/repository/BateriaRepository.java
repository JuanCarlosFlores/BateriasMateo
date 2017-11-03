package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.com.bateriasmateo.domain.Bateria;

@RepositoryRestResource(collectionResourceRel = "Bateria", path="Bateria")
public interface BateriaRepository extends PagingAndSortingRepository<Bateria, Long>{
}
