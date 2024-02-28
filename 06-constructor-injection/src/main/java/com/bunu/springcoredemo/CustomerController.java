package com.bunu.springcoredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }


    @GetMapping("/add")
    public String addCustomer(){
        customerService.addCustomer();
        return "Customer added successfully!";
    }

}
