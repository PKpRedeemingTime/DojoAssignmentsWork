package com.patrickkilpatrick.web.models;

public class Dog extends Animal implements Pet {

	public Dog(String n, String b, int w) {
		name = n;
		breed = b;
		weight = w;
	}
	
	@Override
	public String showAffection() {
		if(weight < 30) {
			return name + " hopped into your lap and cuddled you!";
		}
		else {
			return name + " curled up next to you!";
		}
		
	}
	
}
