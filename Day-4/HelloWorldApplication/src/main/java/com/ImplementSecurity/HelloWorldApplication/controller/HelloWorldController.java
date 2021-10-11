package com.ImplementSecurity.HelloWorldApplication.controller;

import com.ImplementSecurity.HelloWorldApplication.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService hws;


    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String sayHello(){
        return hws.retrieveWelcomeMessage();
    }

    @RequestMapping("/hello/{name}")
    public String greeting(@PathVariable(value="name") String name,
                           @RequestParam(value="location", defaultValue="BLR") String location) {

        return "Hello " + name + " from " + location;
    }

}
