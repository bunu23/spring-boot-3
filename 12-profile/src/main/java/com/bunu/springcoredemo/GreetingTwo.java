package com.bunu.springcoredemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("two")
public class GreetingTwo implements Greeting{

    @Override
    public String getGreeting() {
        return "Hey John";
    }
}
