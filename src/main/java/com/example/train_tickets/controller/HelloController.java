package com.example.train_tickets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {

        return "Hello World!";
    }

    @GetMapping("/world")
    public String getWorld() {
        return "World!";
    }
}
