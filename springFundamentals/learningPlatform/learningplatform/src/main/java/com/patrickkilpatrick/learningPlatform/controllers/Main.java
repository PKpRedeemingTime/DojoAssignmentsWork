package com.patrickkilpatrick.learningPlatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
	public String lesson(@PathVariable("lessonNumber") String number, Model model) {
		String goal;
		
		if(number.equals("0733")) {
			goal = "Setting up your servers";
		} else if(number.equals("0342")){
			goal = "Punch cards";
		} else {
			goal = "Advanced Fortran Intro";
		}
		
		model.addAttribute("goal", goal);
		return "lesson.jsp";
	}
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(@PathVariable("assignmentNumber") String number, Model model) {
		String goal;
		
		if(number.equals("0345")) {
			goal = "Coding Forms";
		} else {
			goal = "Fortran to Binary";
		}
		
		model.addAttribute("goal", goal);
		return "assignment.jsp";
	}
}
