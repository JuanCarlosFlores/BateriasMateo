package ar.com.bateriasmateo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.com.bateriasmateo.domain.BateriaEstado;



@RepositoryRestResource(collectionResourceRel = "BateriaEstado", path="BateriaEstado")
public interface BateriaEstadoRepository extends PagingAndSortingRepository<BateriaEstado, Long>{
}
