package com.qa.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.qa.beans.Owner;
import com.qa.beans.Pet;

public class SpringConfig {

	@Bean
	public Pet pet1Bean() {
		Pet pet = new Pet();
		pet.setName("Meower");
		return pet;
	}

	@Bean
	Pet pet2Bean() {
		return new Pet("Woofer");
	}

	@Bean
	Pet pet3Bean() {
		return new Pet("Squeeks");
	}

	@Bean
	public Owner owner1Bean() {
		Owner owner1 = new Owner();

		owner1.setName("Bobby");
		owner1.setAddress("London");
		owner1.setTel("+447897-456465");

		List<Pet> pets = new ArrayList<Pet>();
		
		pets.add(pet2Bean());
		pets.add(pet3Bean());

		owner1.setPets(pets);

		return owner1;
	}

	@Bean
	public Owner owner2Bean() {
		Owner owner2 = new Owner();

		owner2.setName("Antonio");
		owner2.setAddress("Almeria");
		owner2.setTel("+34455646568");

		List<Pet> pets = new ArrayList<Pet>();

		pets.add(pet1Bean());
		
		owner2.setPets(pets);

		return owner2;
	}
}
