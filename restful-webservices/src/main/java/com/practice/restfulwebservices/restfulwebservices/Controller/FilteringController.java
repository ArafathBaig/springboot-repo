package com.practice.restfulwebservices.restfulwebservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.restfulwebservices.restfulwebservices.Model.SomeBean;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("ab","bc","b3");
	}
}
