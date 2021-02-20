package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String getHomePage() {
		return "<h1>Hey there, what's up?</h1>";
	}
	
}
