package com.bunu.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class GreetingTwo implements Greeting{
    public GreetingTwo(){
        System.out.println("In constructor"+getClass().getSimpleName());
    }
    @Override
    public String getGreeting() {
        return "Hey John";
    }
}
