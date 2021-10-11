package com.example.restservice.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldDao {
    public String retrieveWelcomeMessage() {
        return "How are you Doing";
    }
}
