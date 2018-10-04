package com.patrickkilpatrick.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("/me")
	public String me() {
		return "me.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "projects.html";
	}
	
}
