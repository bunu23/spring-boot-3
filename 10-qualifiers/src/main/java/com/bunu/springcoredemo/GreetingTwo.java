package com.bunu.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class GreetingTwo implements Greeting{

    @Override
    public String getGreeting() {
        return "Hey John";
    }
}
