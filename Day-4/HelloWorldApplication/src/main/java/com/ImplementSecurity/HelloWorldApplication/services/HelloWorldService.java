package com.ImplementSecurity.HelloWorldApplication.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String retrieveWelcomeMessage() {
        return "How are you Doing";
    }
}
