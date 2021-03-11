package com.topservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiSelosApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiSelosApplication.class, args);
	}
}
