package com.springbootpractice.ws.ui.model.Exception;

public class UserServiceException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1977708746733033209L;

	public UserServiceException(String message) {
		super(message);
	}

}
