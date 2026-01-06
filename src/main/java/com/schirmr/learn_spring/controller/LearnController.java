package com.schirmr.learn_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LearnController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    

    @GetMapping("/teste")
    public String teste() {
        return "teste";
    }
    
}
