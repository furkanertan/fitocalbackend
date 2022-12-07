package com.example.fitocalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FitocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitocalApplication.class, args);
	}
}
