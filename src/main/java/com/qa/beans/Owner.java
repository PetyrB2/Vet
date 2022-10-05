package com.qa.beans;

import java.util.List;

public class Owner {

	// Attributes
	private String name;
	private String address;
	private String tel;
	
	// Create a List called pets
	private List<Pet> pets;

	// Getters & Setters
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// toString follows - edited to add attributes of Owner
	// Constructor to pull details of Owner & Pets
	@Override
	public String toString() {
		return "Owner [name=" + name + ", address=" + address + ", tel=" + tel + ", pets=" + pets + "]";
	}
}