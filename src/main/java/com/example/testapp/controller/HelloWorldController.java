package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
public class HelloWorldController {
    @GetMapping
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("name")
    public String sayHelloWithName(String name) {
        return "Hello " + name + "!";
    }
}
