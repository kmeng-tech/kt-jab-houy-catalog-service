package com.kt.jab_houy.catalog_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloController {

    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
