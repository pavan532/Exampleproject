package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFristApplicationApplication {

	void m1() {
		System.out.println("M1 method Also working Fine");
	}
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootFristApplicationApplication.class, args);
		SpringBootFristApplicationApplication s=new SpringBootFristApplicationApplication();
		s.m1();
		System.out.println("Working Fine");
	}

}
