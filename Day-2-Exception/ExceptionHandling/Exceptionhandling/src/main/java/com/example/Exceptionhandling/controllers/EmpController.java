package com.example.Exceptionhandling.controllers;

import com.example.Exceptionhandling.domain.Emp;
import com.example.Exceptionhandling.exception.RecordNotFoundException;
import com.example.Exceptionhandling.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService eservice;

    //Sending Data to client and Content Negotiation using Accept header
    @RequestMapping(value="/emps",
            produces={MediaType.APPLICATION_XML_VALUE})
    public ArrayList<Emp> printEmp(){
        ArrayList<Emp> emps =  eservice.getAllEmps();

        if(emps.size() == 0){
            //throw new NoEmployeesException();
            throw new RecordNotFoundException();
        }
        return emps;

    }
    /**
     @RequestMapping(value="/emps")
     public ArrayList<Emp> printEmp(){
     return eservice.getAllEmps();
     }**/

    //Receiving data from client
    @RequestMapping(value="/emps",
            method=RequestMethod.POST,
            consumes={MediaType.APPLICATION_JSON_VALUE},
            produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ArrayList<Emp> addEmp(@RequestBody Emp e){
        return eservice.insertEmp(e);
    }

    @DeleteMapping("/emps/{eid}")
    //public List<Emp> deleteById(@PathVariable("eid") int id) throws RecordNotFoundException {
    public List<Emp> deleteById(@PathVariable("eid") int id) throws RecordNotFoundException {
        List<Emp> emp;
        /**
         try {
         emp= eservice.deleteById(id);
         } catch (RecordNotFoundException e) {
         e.printStackTrace();
         throw new RecordNotFoundException();
         }**/
        return eservice.deleteById(id);
        //return emp;
    }
}
