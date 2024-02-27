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

  //end point to return general info
    @GetMapping("/course")
    public String getCourse(){
       return "Hey! you are currently enrolled in Spring Boot.";
    }
}
