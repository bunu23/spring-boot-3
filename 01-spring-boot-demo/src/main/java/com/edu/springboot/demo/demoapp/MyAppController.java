package com.edu.springboot.demo.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {
    //"/" is exposed to return "Hello"
   @GetMapping("/")
    public String sayHello(){
       return "Hello!";
    }

}
