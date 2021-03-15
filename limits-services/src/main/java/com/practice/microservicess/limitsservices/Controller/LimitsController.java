package com.practice.microservicess.limitsservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservicess.limitsservices.Bean.Limits;
import com.practice.microservicess.limitsservices.Configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
	
	
}
