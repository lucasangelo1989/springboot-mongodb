package com.lucassilveira.springbootmongodb.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucassilveira.springbootmongodb.domain.User;
import com.lucassilveira.springbootmongodb.dto.UserDTO;
import com.lucassilveira.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value="/users")
class UserResource {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<UserDTO>> findAll(){
		User maria= new User("1", "Maria Brown", "maria@gmail.com");
		User alex= new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = service.findAll();
		List<UserDTO> listdto= list.stream().map(x-> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listdto);
		
	}
}
