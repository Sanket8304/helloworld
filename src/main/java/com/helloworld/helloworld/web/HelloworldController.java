package com.helloworld.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello! World";
    }

    @RequestMapping("/name")
    public String sayname(){
        return "Hello! Sanket";
    }
}
