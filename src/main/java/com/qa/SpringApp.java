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
			System.out.println("");
			System.out.println("Owner 1:");
			System.out.println("---------");
			System.out.println("Owner: " + owner1.getName() + "\nAddress: " + owner1.getAddress() + "\nTelephone: " + owner1.getTel());
			System.out.println("Pet Name: " + p.getName());
		}

		List<Pet> petsB = owner2.getPets();
		for (Pet p : petsB) {
			System.out.println("");
			System.out.println("Owner 2:");
			System.out.println("---------");
			System.out.println("Owner: " + owner2.getName() + "\nAddress: " + owner2.getAddress() + "\nTelephone: " + owner2.getTel());
			System.out.println("Pet Name: " + p.getName());
			System.out.println("");
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
