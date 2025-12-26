package com.springboot.learning.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);

		//Laptop lobj = new Laptop();	// We need not required of creating Laptop class object and call DisplayLaptopDetails() method using Laptop class object.
		//lobj.DisplayLaptopDetails();	// All this things happen internally due to Framework feature i.e => BEAN -> class object
	}									// BEAN => class object -> [ Tank with multiple objects ]

}
