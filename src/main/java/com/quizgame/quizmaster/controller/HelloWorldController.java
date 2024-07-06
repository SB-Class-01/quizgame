package com.quizgame.quizmaster.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @PostMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String hello1() {
        return "Hello World test method";
    }
}
