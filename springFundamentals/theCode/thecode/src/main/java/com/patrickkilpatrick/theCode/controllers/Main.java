package com.patrickkilpatrick.theCode.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
		Boolean isIncorrect = (Boolean) session.getAttribute("isIncorrect");
		
		if(isIncorrect == null) {
			session.setAttribute("isIncorrect", false);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping(value="process", method=RequestMethod.POST)
	public String code(@RequestParam("code") String code, HttpSession session) {
		
		if(code.equals("bushido")) {
			session.setAttribute("isIncorrect", false);
			return "redirect:/code";
		} else {
			session.setAttribute("isIncorrect", true);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}

}
