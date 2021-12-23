package com.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.Emailmodel;
import com.email.service.Emailservice;

@RestController
@CrossOrigin
public class Emailcontroller {
	@Autowired
	private Emailservice emailservice;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "hello this is my api";
		
	}
	@RequestMapping(value = "/send",method = RequestMethod.POST)
	public ResponseEntity<?> sendEmail(@RequestBody Emailmodel model)
	{
		//emailservice.sendemail(null, null, null)
		emailservice.sendemail(model.getTo(), model.getSubject(), model.getMessage());
		
		
		System.out.println(model);
		return ResponseEntity.ok("done");
		
	}

}
