package com.quizgame.quizmaster.controller;
import com.quizgame.quizmaster.entity.User;
import com.quizgame.quizmaster.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String hello1() {
        return "Hello World test method";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
