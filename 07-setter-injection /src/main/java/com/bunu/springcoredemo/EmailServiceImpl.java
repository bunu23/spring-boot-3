package com.bunu.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail() {
        System.out.println("sending Email....");
    }
}
