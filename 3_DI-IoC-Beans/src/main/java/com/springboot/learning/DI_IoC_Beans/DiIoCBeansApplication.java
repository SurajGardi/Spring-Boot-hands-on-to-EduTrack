package com.springboot.learning.DI_IoC_Beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiIoCBeansApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DiIoCBeansApplication.class, args);
		// run() method does 2 tasks:
	}	// 1) Start the Apache Tomcat Server
		// 2) Crete IoC container inside JVM

	// What is Dependancy Injection..?
//  => DI is a Design pattern means it is the coding technique which follow at the time of coading in project
//  => DI tells us to how to write the code
	// To achieve DI => 2 ways
		// 1) => Field Injection => @Autowired
		// 2) => Constructor Injection

	// EX.-> for making PavBhaji => Butter, Potato and Spices are outer dependancies

	// Tight Coupling => Specific depencancy like i want Amul's Butter and Talegaon Potato only => Specific
	// Loose Coupling => Related depencancy like i want Any brands Butter and Potato => Related
}
