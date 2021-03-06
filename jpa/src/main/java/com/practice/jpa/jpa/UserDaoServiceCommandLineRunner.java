package com.practice.jpa.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.jpa.Service.UserDAOService;
import com.practice.jpa.jpa.entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	UserDAOService userdaoService;
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jack", "Admin");
		int isnert = userdaoService.insert(user);
		log.info("New User is created : " + user);
	}

	
}
