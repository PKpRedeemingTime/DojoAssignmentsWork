package com.patrickkilpatrick.displayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	private static Date currentDate = new Date();
	private static SimpleDateFormat formatter;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		formatter = new SimpleDateFormat("EEEE, 'the ' d 'of' MMMM, yyyy");
        String date = formatter.format(currentDate);
        model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		formatter = new SimpleDateFormat("hh:mm aa");
        String date = formatter.format(currentDate);
        model.addAttribute("date", date);
		return "time.jsp";
	}
}
