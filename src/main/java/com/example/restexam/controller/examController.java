package com.example.restexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exam")
public class examController {
    @GetMapping
    public RuntimeException exam() {
        return new RuntimeException("API ERROR");
    }
}
