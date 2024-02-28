package com.bunu.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("one")
public class GreetingService {

    @Autowired
    @Qualifier(value = "greetingOne")
    private Greeting greeting;

    public String getTheGreeting(){
        return greeting.getGreeting();
    }
}
