package com.bunu.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class GreetingOne implements Greeting{

    public GreetingOne(){
        System.out.println("In constructor"+getClass().getSimpleName());
    }


      @Override
    public String getGreeting() {
        return "Hello World";
    }
}
