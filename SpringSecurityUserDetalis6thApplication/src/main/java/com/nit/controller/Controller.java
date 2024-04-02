package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@ResponseBody
	@GetMapping("/come")
	public String welcomepage() {
		
		return"Welcome to Spring Securiy";
	}
}
