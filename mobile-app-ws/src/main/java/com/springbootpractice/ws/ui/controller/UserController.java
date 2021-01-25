package com.springbootpractice.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootpractice.ws.ui.model.response.UserClass;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping(path = "/{userId}")
	public UserClass getUser(@PathVariable("userId") String id) {
		UserClass returnValue = new UserClass();
		
		returnValue.setEmail("araf@gmail.com");
		returnValue.setFirstName("firstName");
		returnValue.setLastName("lastName");
		returnValue.setUserId("userId");
		
		return returnValue;
		
		
	}
	
	@GetMapping()
	public String getUser(@RequestParam(value="page",defaultValue="1") int page,
			@RequestParam(value="limit",defaultValue="50",required=false) int limit,
			@RequestParam(value="sort", required=false) String sort) {
		return "get user called with page: " + page + " limit: "+ limit + " sort: "+ sort ;
	}
	
	
	@PostMapping
	public String createUser() {
		return "create user was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}
}
