package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.com.bateriasmateo.domain.Almacen;

@RepositoryRestResource(collectionResourceRel = "Almacen", path="Almacen")
public interface AlmacenRepository extends PagingAndSortingRepository<Almacen, Long>{

}
