package com.erikprogramacao.estudo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.erikprogramacao.estudo.entities.User;
import com.erikprogramacao.estudo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988887777", "123456");
		User u2 = new User(null, "Bob Marley", "marley@gmail.com", "977776666", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
