package com.springbootpractice.ws.ui.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootpractice.ws.ui.model.request.UserDataRequestModel;
import com.springbootpractice.ws.ui.model.response.UserClass;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserClass> getUser(@PathVariable("userId") String id) {
		UserClass returnValue = new UserClass();
		
		returnValue.setEmail("araf@gmail.com");
		returnValue.setFirstName("firstName");
		returnValue.setLastName("lastName");
		returnValue.setUserId(id);
		
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
		
		
	}
	
	@GetMapping()
	public String getUser(@RequestParam(value="page",defaultValue="1") int page,
			@RequestParam(value="limit",defaultValue="50",required=false) int limit,
			@RequestParam(value="sort", required=false) String sort) {
		return "get user called with page: " + page + " limit: "+ limit + " sort: "+ sort ;
	}
	
	
	@PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserClass> createUser(@Valid @RequestBody UserDataRequestModel userDetails) {
		UserClass returnValue = new UserClass();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		
		return new ResponseEntity(returnValue, HttpStatus.CREATED);
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
