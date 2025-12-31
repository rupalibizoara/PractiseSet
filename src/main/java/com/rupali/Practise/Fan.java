package com.rupali.Practise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fan {

	@PostMapping("/Fanbase")
	public String name() {
		return "i hate you";

	}
}
