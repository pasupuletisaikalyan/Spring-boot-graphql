package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@GetMapping("/test")
	public String getMessage(){
	return "Hello Divya testing Done !";	
	}
}
