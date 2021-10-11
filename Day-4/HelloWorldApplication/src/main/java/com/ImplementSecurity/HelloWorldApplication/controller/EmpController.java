package com.ImplementSecurity.HelloWorldApplication.controller;

import java.util.ArrayList;

import com.ImplementSecurity.HelloWorldApplication.domain.Emp;
import com.ImplementSecurity.HelloWorldApplication.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class EmpController {

    @Autowired
    EmpService eservice;

    //Sending Data to client and Content Negotiation using Accept header
    @RequestMapping(value="/emps", produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ArrayList<Emp> printEmp(){
        return eservice.getAllEmps();
    }

    //Receiving data from client
    @RequestMapping(value="/emps", method=RequestMethod.POST)
    public ArrayList<Emp> addEmp(@RequestBody Emp e){
        return eservice.insertEmp(e);
    }


}