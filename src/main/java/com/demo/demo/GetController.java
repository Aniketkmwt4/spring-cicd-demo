package com.demo.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping
    public String get(){
        return "Hello from v1";
    }
}
