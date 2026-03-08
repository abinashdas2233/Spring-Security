package com.kodewish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbi")
public class SBIController {
	
	
	
	@GetMapping("/contact")
	public String getBalance() {
		
		return "Thanks for contaction";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		
		return "Welcome to sbi";
	}
	
	@GetMapping("/transfer")
	public String transferMoney() {
		
		return "Money transfer done";
	}
	
	@GetMapping("/admin")
	public String adminChannel() {
		
		return "Welcome admin";
	}

}
