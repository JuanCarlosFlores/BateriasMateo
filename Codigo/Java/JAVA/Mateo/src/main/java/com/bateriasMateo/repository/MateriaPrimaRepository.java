package com.bateriasMateo.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.bateriasMateo.domain.MateriaPrima;
import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(collectionResourceRel = "MateriaPrima", path = "MateriaPrima")
public interface MateriaPrimaRepository extends PagingAndSortingRepository<MateriaPrima, Long> {

}
