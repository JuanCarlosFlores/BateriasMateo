package ar.com.bateriasmateo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import ar.com.bateriasmateo.domain.User;


@RepositoryRestResource(collectionResourceRel = "User", path = "User")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	User findByEmail(String email);
}
