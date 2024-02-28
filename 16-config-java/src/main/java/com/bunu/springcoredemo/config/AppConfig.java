package com.bunu.springcoredemo.config;

import com.bunu.springcoredemo.Greeting;
import com.bunu.springcoredemo.GreetingThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    //we can also define custom bean id like @Bean("greetingthree") and inject it
    public Greeting greetingThree(){
        return new GreetingThree();
    }
}
