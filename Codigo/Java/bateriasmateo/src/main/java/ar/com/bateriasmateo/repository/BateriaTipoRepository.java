package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import ar.com.bateriasmateo.domain.BateriaTipo;


@RepositoryRestResource(collectionResourceRel = "BateriaTipo", path="BateriaTipo")
public interface BateriaTipoRepository extends PagingAndSortingRepository<BateriaTipo, Long>{
	public BateriaTipo findByNombre(String pNombre);
}
