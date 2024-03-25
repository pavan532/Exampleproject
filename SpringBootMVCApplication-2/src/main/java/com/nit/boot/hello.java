package com.nit.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/hello")
	public String hellopage() {
		
		return "Hi this is a Spring boot Application";
	}

	//http://localhost:8080/hello
}
