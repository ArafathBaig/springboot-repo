package com.practice.restfulwebservices.restfulwebservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.restfulwebservices.restfulwebservices.Model.HelloWorldBean;

@RestController
public class HelloWorldControlle {
	
	@GetMapping(path="/hello-world")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

}
