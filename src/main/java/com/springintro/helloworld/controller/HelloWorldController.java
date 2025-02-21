package com.springintro.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    //Display message using rest controller
    public String call(){
        return "Hello from BridgeLabz";
    }
}
