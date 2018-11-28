package com.example.wahhoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.wahhoi" })
public class WahhoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WahhoiApplication.class, args);
	}
}
