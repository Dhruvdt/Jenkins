package com.docker.jenkins.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping(value = "/api/v1/admin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
      return "Hello from Spring Boot!";
    }
    @GetMapping("/bye")
    public String sayBye() {
      return "Bye from Spring Boot!";
    }

}