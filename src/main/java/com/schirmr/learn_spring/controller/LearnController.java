package com.schirmr.learn_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LearnController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @PostMapping("/cadastro")
    public String processarCadastro(String username, String password) {
        // Lógica de salvar no banco de dados H2
        
        return "redirect:/login?registered";
    }
    
    @GetMapping("/hello")
    public String helloPage() {
        return "hello";
    }

    @GetMapping("/error")
    public String pageError() {
        return "error";
    }
    
    
    
}
