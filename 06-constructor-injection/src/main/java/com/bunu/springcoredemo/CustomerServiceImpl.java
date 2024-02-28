package com.bunu.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {
    private EmailService emailService;

    public CustomerServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void addCustomer() {
        emailService.sendEmail();
    }
}
