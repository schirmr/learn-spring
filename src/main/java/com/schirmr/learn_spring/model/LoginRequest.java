package com.schirmr.learn_spring.model;

import lombok.Data; // Lombok cria getters e setters automaticamente

@Data
public class LoginRequest {
    private String username;
    private String password;
}
