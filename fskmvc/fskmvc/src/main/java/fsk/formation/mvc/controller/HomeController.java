package fsk.formation.mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fsk.formation.mvc.model.Person;
import fsk.formation.mvc.service.PersonService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("/index")
	public String index(Model model) {
		
		List<Person> persons = service.getAllPersons();
		model.addAttribute("persons",persons);
		System.out.println(persons);
		return "index";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String addPerson(@ModelAttribute Person person) {
		
		return "add";
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public String storePerson(@Valid @ModelAttribute Person person, BindingResult result) {
		
		if(result.hasErrors()) {
			return "add";
		}
		
		person.getAddress().setPerson(person);
		service.savePerson(person);
		return "redirect://home/index";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		
		Person person = service.getPersonById(id);
		model.addAttribute("person",person);
		return "add";
	}
	
	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam long id) {
		service.deletePersonById(id);
		return "redirect://home/index";     
	}
	
	
}
