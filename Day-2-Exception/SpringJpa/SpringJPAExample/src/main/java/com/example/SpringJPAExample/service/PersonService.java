package com.example.SpringJPAExample.service;

import com.example.SpringJPAExample.dao.PersonRepository;
import com.example.SpringJPAExample.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person createPerson(Person person){
        return personRepository.save(person);
    }
}
