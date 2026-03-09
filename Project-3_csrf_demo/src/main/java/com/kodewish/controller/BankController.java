package com.kodewish.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hdfc")
public class BankController {

    @GetMapping("/fetch")
    public String contactUs() {
        return "sbi contact page";
    }

    @PostMapping("/userdata")
    public String addUser(@RequestBody Map<String, String> hm) {

        String name = hm.get("name");
        String email = hm.get("email");

        return "User Added: " + name + " Email: " + email;
    }

}