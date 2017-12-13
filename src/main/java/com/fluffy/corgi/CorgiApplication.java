package com.fluffy.corgi;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class CorgiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorgiApplication.class, args);
	}
}
