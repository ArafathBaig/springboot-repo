package com.practice.restfulwebservices.restfulwebservices.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler
 extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){
		
		ExceptionResponse exception = new ExceptionResponse(new Date() , ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(Exception ex, WebRequest request){
		
		ExceptionResponse exception = new ExceptionResponse(new Date() , ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exception, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PostNotFoundException.class)
	public final ResponseEntity<Object> handlePostNotFoundExceptions(Exception ex, WebRequest request){
		
		ExceptionResponse exception = new ExceptionResponse(new Date() , ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exception, HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		ExceptionResponse exception = new ExceptionResponse(new Date(), "Validation Failed", ex.getBindingResult().toString());
		return new ResponseEntity(exception, HttpStatus.BAD_REQUEST );
	}

	
}
