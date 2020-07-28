package com.peerlender.lendingengine;

import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			userRepository.save(new User(1, "John", "B", 27, "Software Dev"));
			userRepository.save(new User(2, "Peter", "C", 21, "Pilot"));
			userRepository.save(new User(3, "Max", "C", 20, "Teacher"));
	}
}
//Domain package stores domain logic
//Application package stores classes that are not specific to the domain but is specific to the technologies applies
//Domain.model contains the model classes for the domain
//First class is the lending engine class for the lending engine logic