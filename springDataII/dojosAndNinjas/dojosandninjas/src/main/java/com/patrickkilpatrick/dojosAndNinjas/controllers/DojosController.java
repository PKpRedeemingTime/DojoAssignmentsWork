package com.patrickkilpatrick.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrickkilpatrick.dojosAndNinjas.models.Dojo;
import com.patrickkilpatrick.dojosAndNinjas.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojosController {
	@Autowired
	private DojoService dojoService;
	
	@RequestMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@PostMapping("/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
    		return "/dojos/new.jsp";
        }else{
        	dojoService.createDojo(dojo);
        	return "redirect:/ninjas/new";
        }
	}
	
	@RequestMapping("/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.getDojo(id).orElse(null);
		model.addAttribute(id);
		model.addAttribute(dojo);
		return "/dojos/show.jsp";
	}
}
