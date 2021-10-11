package com.ImplementSecurity.HelloWorldApplication.services;

import java.util.ArrayList;

import com.ImplementSecurity.HelloWorldApplication.dao.EmpDao;
import com.ImplementSecurity.HelloWorldApplication.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EmpService {
    @Autowired
    EmpDao edao;

    public ArrayList<Emp> getAllEmps() {
        return edao.getAllEmps();
    }

    public ArrayList<Emp> insertEmp(Emp e) {
        return edao.insertEmp(e);
    }
}