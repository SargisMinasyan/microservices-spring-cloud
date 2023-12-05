package com.javastart.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/account")
public class AccountController {
    @GetMapping(path = "/getExample")
    public String getExample(){
        return "Hello world";
    }

}
