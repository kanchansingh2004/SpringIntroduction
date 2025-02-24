package com.springintro.helloworld;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	private static  final Logger logger = LoggerFactory.getLogger(HelloworldApplication.class);

	public static void main(String[] args) {
		logger.info("Spring Boot Application Starting.....");
		SpringApplication.run(HelloworldApplication.class, args);
		logger.info("Application started successfully");
	}

}
