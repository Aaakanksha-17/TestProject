package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		System.out.println("Test Feature");
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
