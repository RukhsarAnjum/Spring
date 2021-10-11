package com.example.SpringJPAExample.controller;

import com.example.SpringJPAExample.entities.Person;
import com.example.SpringJPAExample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping("/createPerson")
    public Person createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
