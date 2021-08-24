package com.jefferson.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jefferson.course.entities.User;
import com.jefferson.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "name1", "email1", "num 1", "senha 1");
		User u2 = new User(null, "name2", "email2", "num 2", "senha 2");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
