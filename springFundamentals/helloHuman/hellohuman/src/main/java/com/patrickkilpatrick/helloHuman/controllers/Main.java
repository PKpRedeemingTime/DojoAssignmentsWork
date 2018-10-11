package com.patrickkilpatrick.helloHuman.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	@RequestMapping("/")
	public String home(HttpSession session, @RequestParam(value="name", required=false) String name) {
		if(name == null) {
			session.setAttribute("name", "Human");
		} else {
			session.setAttribute("name", name);
		}
		return "index.jsp";
	}
}
