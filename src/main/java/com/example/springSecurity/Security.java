package com.example.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Security {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
