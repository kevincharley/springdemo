package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSpringApplication.class, args);
		System.out.print("success");
	}

}
