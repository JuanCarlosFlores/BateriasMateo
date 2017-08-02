package com.bateriasMateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.bateriasMateo.domain.Insumo;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Insumo", path = "Insumo")
public interface InsumoRepository extends PagingAndSortingRepository<Insumo, Long>{

}
