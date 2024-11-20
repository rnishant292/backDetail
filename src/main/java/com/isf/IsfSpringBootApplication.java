package com.isf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.isf")
public class IsfSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsfSpringBootApplication.class, args);
	}

}
