package com.patrickkilpatrick.ninjaGold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
		if(gold == null) {
			session.setAttribute("gold", 0);
		}
		if(messages == null) {
			session.setAttribute("messages", new ArrayList<String>());
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String generateGold(HttpSession session, @RequestParam("building") String building) {
		Integer gold = (Integer) session.getAttribute("gold");
		Random rand = new Random();
		int goldGenerated = 0;
		ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
		String msg = "";
		
		
		if(building.equals("farm")) {
			goldGenerated = rand.nextInt(11) + 10;
			msg = "You entered a farm and earned " + goldGenerated + " gold.";
		}
		else if(building.equals("cave")) {
			goldGenerated = rand.nextInt(6) + 5;
			msg = "You entered a cave and earned " + goldGenerated + " gold.";
		}
		else if(building.equals("house")) {
			goldGenerated = rand.nextInt(4) + 2;
			msg = "You entered a house and earned " + goldGenerated + " gold.";
		}
		else if(building.equals("casino")) {
			goldGenerated = rand.nextInt(101) - 50;
			if(goldGenerated >= 0) {
				msg = "You entered a casino and earned " + goldGenerated + " gold.";
			} else {
				msg = "You entered a casino and lost " + goldGenerated + " gold.";
			}
		}
		
		messages.add(0, msg);
		gold += goldGenerated;
		session.setAttribute("gold", gold);
		session.setAttribute("messages", messages);
		return "redirect:/";
	}
	
}