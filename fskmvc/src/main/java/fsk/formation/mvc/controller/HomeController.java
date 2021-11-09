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

import fsk.formation.mvc.model.Abonnement;
import fsk.formation.mvc.model.Clients;
import fsk.formation.mvc.service.AbonnementService;
import fsk.formation.mvc.service.ClientService;

@Controller
public class HomeController {
	
	@Autowired
	private ClientService service;
	
	@Autowired
	private AbonnementService serviceAbonnement;
	

	
	@RequestMapping("/")
	public String index(Model model) {
		List<Clients> clients = service.getAllPersons();
		model.addAttribute("clients",clients);
		return "index";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String addPerson(@ModelAttribute Clients client) {
		
		return "add";
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public String storePerson(@Valid @ModelAttribute Clients client, BindingResult result) {
		
		if(result.hasErrors()) {
			return "add";
		}
		
		client.getAbonnement().setClient(client);
		service.savePerson(client);
		return "redirect://";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		
		Clients client = service.getPersonById(id);
		model.addAttribute("clients",client);
		return "add";
	}

	
}
