package com.bunu.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class GreetingOne implements Greeting {
    @Override
    public String getGreeting() {
        return "Hello World";

    }
}
