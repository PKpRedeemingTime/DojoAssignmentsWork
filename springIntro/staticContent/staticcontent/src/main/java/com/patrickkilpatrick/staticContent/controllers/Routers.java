package com.patrickkilpatrick.staticContent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Routers {
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
}
