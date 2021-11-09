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

import fsk.formation.mvc.model.Abonnement;
import fsk.formation.mvc.service.AbonnementService;

@Controller
public class AbonnementController {
	
	
	
	@Autowired
	private AbonnementService serviceAbonnement;
	
	@RequestMapping("/Abonnement")
	public String index(Model model) {
		List<Abonnement> abonnements = serviceAbonnement.getAllAbonnement();
		model.addAttribute("abonnements",abonnements);
		return "index";
	}
	
	@RequestMapping(value="/addAbonnement",method = RequestMethod.GET)
	public String addAbonnement(@ModelAttribute Abonnement abonnement) {
		
		return "addAbonnement";
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public String storeAbonnement(@Valid @ModelAttribute Abonnement abonnement, BindingResult result) {
		
		if(result.hasErrors()) {
			return "add";
		}
		
		serviceAbonnement.saveAbonnement(abonnement);
		return "redirect://Abonnement";
	}
	
	@RequestMapping("/editAbonnement/{id}")
	public String edit(@PathVariable Long id, Model model) {
		
		Abonnement abonnement = serviceAbonnement.getAbonnementById(id);
		model.addAttribute("abonnements",abonnement);
		return "addAbonnement";
	}

	
}
