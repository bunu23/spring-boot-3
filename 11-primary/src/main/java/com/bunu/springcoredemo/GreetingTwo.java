package com.bunu.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GreetingTwo implements Greeting{

    @Override
    public String getGreeting() {
        return "Hey John";
    }
}
