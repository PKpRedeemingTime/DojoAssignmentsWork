package com.patrickkilpatrick.finalLanguages.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrickkilpatrick.finalLanguages.models.Language;
import com.patrickkilpatrick.finalLanguages.services.LanguageService;


@Controller
public class Main {
	@Autowired
	private LanguageService languageService;

	@RequestMapping("/")
	public String index(@ModelAttribute("language") Language language, Model model) {
		model.addAttribute("languages", languageService.getLanguages());
		return "languages/index.jsp";	
	}
	
	@PostMapping("/")
	public String createLanguages(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	model.addAttribute("languages", languageService.getLanguages());
    		return "languages/index.jsp";
        }else{
        	languageService.addLanguage(language);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/languages/{id}")
	public String showLanguage(Model model, @PathVariable("id") Long id) {
    	Language lang = languageService.getLanguage(id).orElse(null);
    	model.addAttribute("id", id);
    	model.addAttribute("language", lang);
		return "languages/show.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(Model model, @PathVariable("id") Long id) {
    	Language lang = languageService.getLanguage(id).orElse(null);
    	model.addAttribute("id", id);
    	model.addAttribute("language", lang);
		return "languages/edit.jsp";
	}
	
	@PostMapping("/languages/update/{id}")
	public String updateLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
    		return "languages/edit.jsp";
        }else{
        	languageService.updateLanguage(language);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
    	languageService.deleteLanguage(id);
        return "redirect:/";
	}
	
}
