package com.bunu.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class GreetingOne implements Greeting{

    public GreetingOne(){
        System.out.println("In constructor"+getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void init(){
        System.out.println("In doMyStartUp: "+getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void cleanup(){
        System.out.println("In doMyCleanUp: "+getClass().getSimpleName());
    }
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
