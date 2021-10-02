package com.example.release.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping(path = "/")
    public String index() {
        return "homepage making a change";
    }
}
