package com.springbootpractice.ws.ui.response;

import javax.validation.constraints.Size;

public class UserDataResponseModel {
	
	@Size(min=2)
	private String firstName;
	
	@Size(min=2)
	private String lastName;

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
	
	
}
