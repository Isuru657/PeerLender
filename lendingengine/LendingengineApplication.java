package com.peerlender.lendingengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

}
//Domain package stores domain logic
//Application package stores classes that are not specific to the domain but is specific to the technologies applies
//Domain.model contains the model classes for the domain
//First class is the lending engine class for the lending engine logic