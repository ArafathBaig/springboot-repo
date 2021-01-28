package com.appsdeveloper.photoappUsers.PhotoAppsUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppsUserApplication.class, args);
	}

}
