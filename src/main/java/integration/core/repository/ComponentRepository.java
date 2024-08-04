package integration.core.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import integration.core.domain.configuration.Component;

@Repository
public interface ComponentRepository extends CrudRepository<Component, Long> {
	
	@Query(name = "getByNameAndRoute", value = "select c from Component c where c.name = ?1")
	Component getByNameAndRoute(String componentName, String routeName);	
	
	@Query(name = "getByName", value = "select c from Component c where c.name = ?1")
	Component getByName(String name);
	
}
