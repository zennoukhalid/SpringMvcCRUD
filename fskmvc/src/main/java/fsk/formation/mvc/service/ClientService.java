package fsk.formation.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsk.formation.mvc.model.Clients;
import fsk.formation.mvc.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Clients> getAllPersons(){
		
		return repository.findAll();
	}
	
	public Clients getPersonById(Long id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Clients savePerson(Clients client) {
		
		return repository.save(client);
	}
	

}
