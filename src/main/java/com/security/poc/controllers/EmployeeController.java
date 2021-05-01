package com.security.poc.controllers;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/v1/employee")
@RestController
public class EmployeeController {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@GetMapping(value="details", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getEmployeeDetails(){
		log.info("In details endpoint");
		JSONObject employee = new JSONObject();
		employee.put("Name", "Boudhayan Dev");
		employee.put("Type", "Employee");
		return new ResponseEntity<>(employee.toString(), HttpStatus.OK);
	}
}
