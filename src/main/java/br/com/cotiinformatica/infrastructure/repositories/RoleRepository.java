package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.entities.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, UUID> {

	@Query("{ 'name' : ?0 }")
	public Role findByName(String name);
	
}
