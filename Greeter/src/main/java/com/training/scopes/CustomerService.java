package com.training.scopes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    public void getService() {
        System.out.println("I am called");
    }
}
