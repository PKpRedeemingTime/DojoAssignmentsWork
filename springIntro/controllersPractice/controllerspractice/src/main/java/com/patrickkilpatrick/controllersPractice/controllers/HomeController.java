package com.patrickkilpatrick.controllersPractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello world?";
	}
	@RequestMapping("/world")
	public String world() {
		return "Method level annotation";
	}
}
