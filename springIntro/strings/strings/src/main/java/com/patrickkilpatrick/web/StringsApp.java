package com.patrickkilpatrick.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApp {
	public static void main(String[] args) {
        SpringApplication.run(StringsApp.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
    	return "Hello, client! How are you doing?";
    }
	
	@RequestMapping("/Random")
	public String random() {
    	return "Spring boot is great! So easy to just respond with strings!";
    }
}
