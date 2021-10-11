package com.example.restservice.controller;

import com.example.restservice.domain.Emp;
import com.example.restservice.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpController {

    @Autowired
    EmpService eservice;

    //Sending Data to client and Content Negotiation using Accept header
    @RequestMapping(value="/emps",
            produces={MediaType.APPLICATION_XML_VALUE})
    public ArrayList<Emp> printEmp(){
        return eservice.getAllEmps();
    }

    //Receiving data from client
    @RequestMapping(value="/emps",
            method=RequestMethod.POST,
            consumes={MediaType.APPLICATION_JSON_VALUE},
            produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Emp> addEmp(@RequestBody Emp e){
        return eservice.insertEmp(e);
    }

    @DeleteMapping("/emps/{eid}")
    public ArrayList<Emp> deleteById(@PathVariable("eid") int id){
        return eservice.deleteById(id);
    }


}
