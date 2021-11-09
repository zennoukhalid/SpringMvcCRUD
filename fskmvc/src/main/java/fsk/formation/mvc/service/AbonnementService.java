package fsk.formation.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsk.formation.mvc.model.Abonnement;
import fsk.formation.mvc.model.Clients;
import fsk.formation.mvc.repository.AbonnementRepository;
import fsk.formation.mvc.repository.ClientRepository;

@Service
public class AbonnementService {
	
	@Autowired
	private AbonnementRepository repository;
	
	public List<Abonnement> getAllAbonnement(){
		
		return repository.findAll();
	}
	
	public Abonnement getAbonnementById(Long id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Abonnement saveAbonnement(Abonnement abonnement) {
		
		return repository.save(abonnement);
	}
	

}
