package com.springbootpractice.ws.userservice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springbootpractice.ws.ui.model.response.UserClass;
import com.springbootpractice.ws.ui.request.UserDataRequestModel;

@Service
public class UserServiceImpl implements UserService{
	
	Map<String, UserClass> db = new HashMap<>();
	@Override
	public UserClass createUser(UserDataRequestModel userDetails) {
		UserClass returnValue = new UserClass();
		returnValue.setEmail(userDetails.getEmailId());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		
		String userId = UUID.randomUUID().toString();
		
		returnValue.setUserId(userId);
		db.put(userId, returnValue);
		return returnValue;
	}

}
