package com.rupali.Practise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fan {

	@PostMapping("/Fanbase")
	public String name() {
		System.out.println("this is pen");
		return "i hate you";
		

	}
}
