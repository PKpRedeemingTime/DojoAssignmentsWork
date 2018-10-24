package com.patrickkilpatrick.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrickkilpatrick.relationships.models.Person;
import com.patrickkilpatrick.relationships.services.PersonService;

@Controller
@RequestMapping("/persons")
public class Persons {
	@Autowired 
	private PersonService personService;
	
	@RequestMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "/persons/new.jsp";
	}
	
	@RequestMapping("/{id}")
	public String showPerson(Model model, @PathVariable("id") Long id) {
		Person person = personService.getPerson(id).orElse(null);
		model.addAttribute("id", id);
		model.addAttribute("person", person);
		return "/persons/show.jsp";
	}
	
	@PostMapping("/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
    		return "persons/new.jsp";
        }else{
        	personService.createPerson(person);
        	return "redirect:/licenses/new";
        }
	}
	
}
