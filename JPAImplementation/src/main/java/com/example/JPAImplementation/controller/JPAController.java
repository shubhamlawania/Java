package com.example.JPAImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPAImplementation.entity.JPAEntity;
import com.example.JPAImplementation.request.JPARequest;
import com.example.JPAImplementation.service.JPAService;

@RestController
public class JPAController 
{
	@Autowired
	JPAService service;
	
	// -------------------------------- Register (Creating entry in database) --------------------------
	@PostMapping("/register")
	public String create(@RequestBody JPARequest request){
		return service.register(request);
	}
	
	// -------------------------------- Log-In (verifying details from database) -----------------------
	@GetMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password){
		return service.login(username,password);
	}

}
