package com.bunu.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.CustomerService;

@SpringBootApplication
@ComponentScan(basePackages = {"service"})
public class SpringcoredemoApplication implements CommandLineRunner {


    CustomerService customerService;
    public static void main(String[] args) {
        SpringApplication.run(SpringcoredemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        customerService.addCustomer();
    }
}
