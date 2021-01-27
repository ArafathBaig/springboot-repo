package com.springbootpractice.ws.userservice;

import org.springframework.stereotype.Repository;

import com.springbootpractice.ws.ui.model.response.UserClass;
import com.springbootpractice.ws.ui.request.UserDataRequestModel;

@Repository
public interface UserService {
	public UserClass createUser(UserDataRequestModel userDetails);
}
