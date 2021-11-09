package fsk.formation.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsk.formation.mvc.model.Person;
import fsk.formation.mvc.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public List<Person> getAllPersons(){
		
		return repository.findAll();
	}
	
	public Person getPersonById(Long id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Person savePerson(Person person) {
		
		return repository.save(person);
	}
	
	public void deletePersonById(Long id) {
		repository.deleteById(id);
    }

}
