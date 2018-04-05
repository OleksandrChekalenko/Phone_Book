package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.File;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		String prop = System.getProperty("lardi.conf");
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		if (prop != null && !prop.equals("") && new File(prop).exists()) {
			builder.properties("spring.config.location=" + prop);
		}
		builder.run(args);

		//SpringApplication.run(Application.class, args);
	}
}
