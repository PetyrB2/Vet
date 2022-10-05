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
		pet.setSpecies("Cat");
		pet.setDob("01/01/2018");
		return pet;
	}

	@Bean
	Pet pet2Bean() {
		Pet pet = new Pet();
		pet.setName("Dougal");
		pet.setSpecies("Dog");
		pet.setDob("02/02/2022");
		return pet;
	}

	@Bean
	Pet pet3Bean() {
		Pet pet = new Pet();
		pet.setName("Mr Squeeks");
		pet.setSpecies("Mouse");
		pet.setDob("03/03/2013");
		return pet;
	}

	@Bean
	public Owner owner1Bean() {
		Owner owner1 = new Owner();

		owner1.setName("Bobby");
		owner1.setAddress("London");
		owner1.setTel("+447897-456465");

		List<Pet> pets = new ArrayList<Pet>();

		pets.add(pet2Bean());

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
	
	@Bean
	public Owner owner3Bean() {
		Owner owner3 = new Owner();

		owner3.setName("Rosa");
		owner3.setAddress("Poznan");
		owner3.setTel("+48789654789");

		List<Pet> pets = new ArrayList<Pet>();

		pets.add(pet3Bean());

		owner3.setPets(pets);

		return owner3;
	}
}
