package com.example.JPAImplementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPAImplementation.entity.JPAEntity;
import com.example.JPAImplementation.repo.JPARepo;
import com.example.JPAImplementation.request.JPARequest;
import com.example.JPAImplementation.response.JPAResponse;

@Service
public class JPAService 
{
	
	@Autowired
	JPARepo repo;
	
	
	// ------------------------ function which handle registration ------------------
	public String register (JPARequest request){
		
		JPAEntity entity = new JPAEntity();
		entity.setName(request.getName());
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		repo.save(entity);		
		return "user created succesfully";
	}
	
	
	
	
	
	/*@Autowired
	JPARepo repo1;*/
	
	// ------------------------ function to check details from database ------------------
	public String login(String username, String password) {
		JPAEntity obj= repo.validate(username, password);
		if(obj != null) {
		return "SuccessFully login";
		}
		else {
			return "Log-in Failed";
		}
	}

}
