package com.example.springSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Security {
    @GetMapping("/")
    public String index(HttpServletRequest request) {

        return "Hello World"+request.getSession().getId();
    }
}
