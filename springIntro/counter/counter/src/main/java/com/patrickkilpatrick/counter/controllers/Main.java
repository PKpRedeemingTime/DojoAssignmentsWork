package com.patrickkilpatrick.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Main {
	@RequestMapping("/")
	public String home(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			session.setAttribute("count", 1);
		} else {
			Integer currentCount = count + 1;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	@RequestMapping("/destroy")
	public RedirectView destroy(HttpSession session) {
		session.setAttribute("count", null);
		return new RedirectView("/");
	}
}
