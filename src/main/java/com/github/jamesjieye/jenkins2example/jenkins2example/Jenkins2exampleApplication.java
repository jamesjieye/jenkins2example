package com.github.jamesjieye.jenkins2example.jenkins2example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins2exampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jenkins2exampleApplication.class, args);
		ObjectMapper mapper = new ObjectMapper();
	}
}
