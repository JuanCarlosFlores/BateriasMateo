package ar.com.bateriasmateo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.com.bateriasmateo.domain.Almacen;
import ar.com.bateriasmateo.domain.Bateria;
import ar.com.bateriasmateo.domain.BateriaTipo;

@RepositoryRestResource(collectionResourceRel = "Bateria", path="Bateria")
public interface BateriaRepository extends PagingAndSortingRepository<Bateria, Long>{
		public List<Bateria> findByAlmacen(Almacen pAlmacen);

		public List<Bateria> findByAlmacenAndBateriaTipo(Almacen almacen, BateriaTipo pBateriaTipo);
}
