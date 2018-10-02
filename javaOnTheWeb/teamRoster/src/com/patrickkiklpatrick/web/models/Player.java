package com.patrickkiklpatrick.web.models;

public class Player {
	private String firstName;
	private String lastName;
	private int age;
	
	public Player() {
		
	}
	
	public Player(String fName, String lName, int age) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
