package ar.com.bateriasmateo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.Role;


@RepositoryRestResource(collectionResourceRel = "Role", path = "Role")
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>{
	Role findByRole(String role);
}
