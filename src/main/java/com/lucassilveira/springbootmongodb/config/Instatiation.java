package com.lucassilveira.springbootmongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucassilveira.springbootmongodb.domain.User;
import com.lucassilveira.springbootmongodb.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository ;
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User maria= new User(null, "Maria Brown", "maria@gmail.com");
		User alex= new User(null, "Alex Green", "alex@gmail.com");
		User bob= new User(null, "Bob Grey", "bob@gmail.com");
		userRepository.save(maria);
		userRepository.save(alex);
		userRepository.save(bob);	
		
	}

}
