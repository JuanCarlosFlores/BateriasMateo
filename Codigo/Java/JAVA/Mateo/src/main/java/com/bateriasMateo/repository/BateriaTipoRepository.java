package com.bateriasMateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bateriasMateo.domain.BateriaTipo;
	
	@RepositoryRestResource(collectionResourceRel = "bateriaTipo", path = "bateriaTipo")
	public interface BateriaTipoRepository extends PagingAndSortingRepository<BateriaTipo,Long>{
	
}
