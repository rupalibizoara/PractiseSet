package com.rupali.Practise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Generated;

@RestController
public class Keyword {
	
	@GetMapping("/hey-rupali")
	public String name() {
		return "you are intelligent";
		
	}

}
