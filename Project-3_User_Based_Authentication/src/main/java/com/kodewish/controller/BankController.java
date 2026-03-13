package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.service.AccountService;

@RestController
public class BankController {
	  @Autowired
	    AccountService service;

	    @GetMapping("/balance")  //user
	    public String getBalance()
	    {
	            return service.getBalance();
	    }


	    @PostMapping("/close") //ADMIN
	    public String closeAccount()
	    {
	            return service.closeAccount();
	    }

	    @GetMapping("/about")
	    public String about()
	    {
	        return "hello ji hum lunch pe ha";
	    }
}
