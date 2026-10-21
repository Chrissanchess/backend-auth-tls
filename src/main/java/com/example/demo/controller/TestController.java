package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/auth/ping")
    public String ping() {
        return "pong (publico)";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "hola (protegido)";
    }
}