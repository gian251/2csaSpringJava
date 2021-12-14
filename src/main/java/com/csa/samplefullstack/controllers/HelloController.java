package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*") 
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello spring!";
    }
}
