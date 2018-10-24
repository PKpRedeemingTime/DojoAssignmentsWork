package com.patrickkilpatrick.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrickkilpatrick.dojosAndNinjas.models.Ninja;
import com.patrickkilpatrick.dojosAndNinjas.services.DojoService;
import com.patrickkilpatrick.dojosAndNinjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjasController {
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@RequestMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAll());
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/new")
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoService.getAll());
    		return "/ninjas/new.jsp";
        }else{
        	ninjaService.createNinja(ninja);
        	String dojoId = Long.toString(ninja.getDojo().getId());
        	return "redirect:/dojos/".concat(dojoId);
        }
	}

}
