package com.qa.beans;

public class Pet {

	// Attributes
	private String name;
	
	// Basic empty constructor
	public Pet() {}

	// Constructor with name
	public Pet(String name) {
		this.name = name;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Override for toString()
	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
	
}
