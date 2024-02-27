package com.edu.springboot.demo.demoapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

    //inject properties for course.name
    @Value ("${course.name}")
    private String courseName;

    //"/" is exposed to return "Hello"
   @GetMapping("/")
    public String sayHello(){
       return "Hello!";
    }

  //end point to return general info
    @GetMapping("/course")
    public String getCourse(){
       return "Course : " + courseName;
    }
}
