package com.qa.beans;

import java.util.List;

public class Owner {

	private String name;

	private List<Pet> pets;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", pets=" + pets + "]";
	}

}