package com.example.springboot_restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {
    public String index() {
        return "Wellcome to Spring Boot REST API";
    }
}
