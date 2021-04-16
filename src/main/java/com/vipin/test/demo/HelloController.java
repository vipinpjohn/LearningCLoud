package com.vipin.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path = "/get")
	public  String get()
	{
		
		
		return "Hello";
	}
	
	
	
}
