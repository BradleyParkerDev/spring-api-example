package com.bradley.spring_api_example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, Bradley! This is a greeting from your Java server!";
    }

    @PostMapping("/greet")
    public String greetUser(@RequestBody GreetingRequest request) {
        return "Hello, " + request.getName() + "! Your message: " + request.getMessage();
    }
}
