package com.springbootpractice.ws.ui.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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

import com.springbootpractice.ws.ui.model.response.UserClass;
import com.springbootpractice.ws.ui.request.UserDataRequestModel;
import com.springbootpractice.ws.ui.response.UserDataResponseModel;

@RestController
@RequestMapping("users")
public class UserController {
	
	Map<String, UserClass> db = new HashMap<>();
	@GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserClass> getUser(@PathVariable("userId") String userId) {
		
		if(!db.containsKey(userId))
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		UserClass returnValue = db.get(userId);

		return new ResponseEntity(returnValue,HttpStatus.OK);
		
		
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
		returnValue.setEmail(userDetails.getEmailId());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		
		String userId = UUID.randomUUID().toString();
		
		returnValue.setUserId(userId);
		db.put(userId, returnValue);
		return new ResponseEntity(returnValue, HttpStatus.CREATED);
	}
	
	@PutMapping(value= "/{userId}",consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserClass> updateUser(@Valid @RequestBody UserDataResponseModel userDetails,@PathVariable String userId) {
		
		if(!db.containsKey(userId)) {
			new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		UserClass user = db.get(userId);
		
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}
}
