package com.schirmr.learn_spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LearnApiController {
    @GetMapping("/api")
    public String api() {
        return "API esta funcionando";
    }
    @GetMapping("/api/tarefas")
    public String listarTarefas(@RequestParam String status) {
        if(status.equals("concluido")){
            return "Listando tarefas concluídas";
        } else {
            return "Listando todas as tarefas";
        }
    }
}
