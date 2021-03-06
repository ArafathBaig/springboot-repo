package com.practice.restfulwebservices.restfulwebservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practice.restfulwebservices.restfulwebservices.DAO.UserDaoService;
import com.practice.restfulwebservices.restfulwebservices.Exception.UserNotFoundException;
import com.practice.restfulwebservices.restfulwebservices.Model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;

	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = userDaoService.findOne(id);
		
		if(user == null)
			throw new UserNotFoundException("id-" + id);
		
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity createUser(@RequestBody User user) {
		User savedUser = userDaoService.save(user);
		
		java.net.URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
