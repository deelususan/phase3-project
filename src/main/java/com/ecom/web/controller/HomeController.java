package com.ecom.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {

	
	@GetMapping(value="/")
	public String loginPage() {

		return "login";
		
	}
	
	@GetMapping(value="/home")
	public String homePage() {
		return "home";
		
	}
	

	
}
