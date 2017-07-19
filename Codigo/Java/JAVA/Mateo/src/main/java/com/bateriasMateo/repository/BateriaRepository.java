package com.bateriasMateo.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bateriasMateo.domain.Bateria;

import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(collectionResourceRel = "bateria", path = "bateria")
public interface BateriaRepository extends PagingAndSortingRepository<Bateria, Long>{
	

}
