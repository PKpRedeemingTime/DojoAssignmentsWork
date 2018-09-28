package com.patrickkilpatrick.web.models;

public class Cat extends Animal implements Pet {

	public Cat(String n, String b, int w) {
		name = n;
		breed = b;
		weight = w;
	}
	
	@Override
	public String showAffection() {
		return "Your " + breed + " cat, " + name + " looked at you with affection. You think.";
	}
	
}
