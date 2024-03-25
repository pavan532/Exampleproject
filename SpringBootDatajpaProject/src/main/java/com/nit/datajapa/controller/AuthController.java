package com.nit.datajapa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.payload.UsersDto;
import com.nit.datajapa.service.UsersServices;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private UsersServices service;
	
	@PostMapping("/register")
	public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto user ){
		
		return new ResponseEntity<UsersDto>(service.createuser(user),HttpStatus.CREATED);
	}
}
