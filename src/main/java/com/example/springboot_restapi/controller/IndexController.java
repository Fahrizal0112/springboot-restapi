package com.example.springboot_restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "Wellcome to Spring Boot REST API";
    }
}
