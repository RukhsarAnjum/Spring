package com.example.restservice.service;

import com.example.restservice.dao.HelloWorldDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    HelloWorldDao hwd;

    public String retrieveWelcomeMessage() {
        return hwd.retrieveWelcomeMessage();
    }
}
