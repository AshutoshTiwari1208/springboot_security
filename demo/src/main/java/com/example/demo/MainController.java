package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String getHomePage() {
		return "<h1>Hey there, what's up?</h1>";
	}
	
	@RequestMapping("/admin")
	public String getAdminPage() {
		return "<h2> Yo hoo, Admin's page it is</h2>";
	}
	
	@RequestMapping("/admin/1")
	public String getAdminPage1() {
		return "<h2> Exact page - Admin, Admin's page 1 it is</h2>";
	}
	
	@RequestMapping("/user")
	public String getUserPage() {
		return "<h2>Hey you are a user wohooo</h2>";
	}

}