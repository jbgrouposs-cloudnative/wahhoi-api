package com.example.wahhoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.wahhoi" })
public class WahhoiApplication {

	private static int v = 1;

	public static void main(String[] args) {
		System.out.println("HELLO! I am the WAHHOI api server version " + v + " !");
		System.out.println("PLEASE ENJOY YOUR WAHHOI LIFE !!");
		SpringApplication.run(WahhoiApplication.class, args);
	}
}
