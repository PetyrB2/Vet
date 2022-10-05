package com.qa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.beans.Owner;
import com.qa.beans.Pet;
import com.qa.config.SpringConfig;

public class SpringApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		Owner owner1 = (Owner) ctx.getBean("owner1Bean");
		Owner owner2 = (Owner) ctx.getBean("owner2Bean");

		List<Pet> petsA = owner1.getPets();

		for (Pet p : petsA) {
			System.out.println("Owner 1:");
			System.out.println("Pet Name :" + p.getName() + "\nPet Owner: " + owner1.getName() + "\n----------------");
		}

		List<Pet> petsB = owner2.getPets();
		for (Pet p : petsB) {
			System.out.println("Owner 2:");
			System.out.println("Pet Name :" + p.getName() + "\nPet Owner: " + owner2.getName() + "\n----------------");
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
