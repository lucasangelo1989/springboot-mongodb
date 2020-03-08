package com.lucassilveira.springbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucassilveira.springbootmongodb.domain.User;
import com.lucassilveira.springbootmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo; 
	
	public List<User> findAll(){
		
		return repo.findAll();
		
		
	}
}
