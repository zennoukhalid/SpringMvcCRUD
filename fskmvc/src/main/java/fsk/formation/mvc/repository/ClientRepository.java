package fsk.formation.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fsk.formation.mvc.model.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long> {
		
	
	
}
