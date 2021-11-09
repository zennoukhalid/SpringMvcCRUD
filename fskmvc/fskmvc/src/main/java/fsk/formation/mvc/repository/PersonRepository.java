package fsk.formation.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fsk.formation.mvc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
		
	
	
}
