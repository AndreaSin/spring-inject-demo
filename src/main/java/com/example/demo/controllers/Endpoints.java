package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.Operations;

@RestController
public class Endpoints {
	
	/* field level
	
	@Autowired
	Operations op;
	
	*/
	
	
	// constructor level
	 
	Operations op;
	
	//@Autowired non è piu richiesto
	public Endpoints(Operations op) {
		this.op = op; 

	}
	
	
	
	
	/* setter level
	  
	Operations op;
	
	@Autowired //NON opzionale
	public void setOperations(Operations op) {
		this.op = op;		
	}
	 
	*/
	
	
	@GetMapping("/result")
	public int result() {
		return op.sum(1,2);
	}


	

}
