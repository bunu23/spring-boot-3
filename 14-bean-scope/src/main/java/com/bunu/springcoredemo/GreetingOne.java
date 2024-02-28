package com.bunu.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingOne implements Greeting{

    public GreetingOne(){
        System.out.println("In constructor"+getClass().getSimpleName());
    }
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
