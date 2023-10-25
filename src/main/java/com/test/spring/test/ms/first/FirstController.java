package com.test.spring.test.ms.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/display")
	public String display() {
		return "hey there.";
	}

}
