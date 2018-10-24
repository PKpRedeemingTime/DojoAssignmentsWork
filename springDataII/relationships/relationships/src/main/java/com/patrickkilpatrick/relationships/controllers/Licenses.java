package com.patrickkilpatrick.relationships.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrickkilpatrick.relationships.models.License;
import com.patrickkilpatrick.relationships.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class Licenses {
	@Autowired
	private PersonService personService;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class,  new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping("/new")
	private String createLicense(@ModelAttribute License license, Model model) {
		model.addAttribute("persons", personService.allPersons());
		return "licenses/new.jsp";
	}
	
	@PostMapping("/new")
	public String createLicense(@Valid @ModelAttribute License license, BindingResult result) {
		if (result.hasErrors()) {
    		return "licenses/new.jsp";
        }else{
        	personService.createLicense(license);
        	String personId = Long.toString(license.getPerson().getId());
        	return "redirect:/persons/".concat(personId);
        }
	}
	
}
