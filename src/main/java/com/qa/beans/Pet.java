package com.qa.beans;

public class Pet {

	// Attributes
	private String name;
	private String species;
	private String dob;

	// Basic empty constructor
	public Pet() {
	}

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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	// Override for toString()
	@Override
	public String toString() {
		return "Pet [name=" + name + ", species=" + species + ", dob=" + dob + "]";
	}

}
