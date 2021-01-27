package com.springbootpractice.ws.ui.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserDataRequestModel {
	
	
	@Size(min=2,message="Name should be greater than 2 characters")
	private String firstName;
	
	@Size(min=2,message="Name should be greater than 2 characters")
	private String lastName;
	
	@Email
	private String emailId;
	
	@Size(min = 8, max = 16, message="Should be between 8 and 16")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
