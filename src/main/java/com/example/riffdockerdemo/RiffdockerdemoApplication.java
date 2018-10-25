package com.example.riffdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class RiffdockerdemoApplication {

	@Bean
	public Function<String, String> upper() {
		return value -> value.toUpperCase();
	}

	public static void main(String[] args) {
		SpringApplication.run(RiffdockerdemoApplication.class, args);
	}
}
