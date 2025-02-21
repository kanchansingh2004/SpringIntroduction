package com.springintro.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldWebController {
    @GetMapping("/helloworld")
    public String call(Model model){
        model.addAttribute("Message","Hello From BridgeLabz");
        return "helloworld";
    }
}
