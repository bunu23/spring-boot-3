package com.bunu.springcoredemo;

public class GreetingThree implements Greeting{

    public GreetingThree(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getGreeting() {
        return "Hello, how are you doing?";
    }
}
