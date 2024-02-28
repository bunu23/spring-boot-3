package com.bunu.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private Greeting greeting;


  @Autowired
  public GreetingController(
          @Qualifier("greetingOne") Greeting greeting){
      this.greeting=greeting;

  }

@GetMapping("/greeting")
    public String getGreeting(){
      return greeting.getGreeting();
}

    }


