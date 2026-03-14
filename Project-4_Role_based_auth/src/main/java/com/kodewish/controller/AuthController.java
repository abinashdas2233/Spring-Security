package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.entity.User;
import com.kodewish.repo.UserRepo;

@RestController
	public class AuthController {

	    @Autowired
	    private UserRepo repo;

	    @Autowired
	    private PasswordEncoder encoder;

	    @PostMapping("/register")
	    public String register(@RequestBody User user){

	        user.setPassword(encoder.encode(user.getPassword()));

	        repo.save(user);

	        return "User registered";
	    }
	    @GetMapping("/admin")
	    public String adminAccess(){
	        return "Welcome ADMIN";
	    }

	    @GetMapping("/user")
	    public String userAccess(){
	        return "Welcome USER";
	    }

	    @GetMapping("/profile")
	    public String profile(){
	        return "User Profile";
	    }


}
