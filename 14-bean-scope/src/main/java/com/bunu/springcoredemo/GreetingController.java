package com.bunu.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private Greeting greeting;
  private Greeting greet;

  @Autowired
  public GreetingController(
          @Qualifier("greetingOne") Greeting greeting,
          @Qualifier("greetingOne") Greeting greet){
      this.greeting=greeting;
      this.greet=greet;
  }

@GetMapping("/greeting")
    public String getGreeting(){
      return greeting.getGreeting();
}
@GetMapping("/check")
    public String check(){
      return "comparing beans => greeting and greet : "+(greeting==greet);
}

    }


