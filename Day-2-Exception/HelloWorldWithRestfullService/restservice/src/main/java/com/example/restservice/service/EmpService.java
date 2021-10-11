package com.example.restservice.service;

import com.example.restservice.dao.EmpDao;
import com.example.restservice.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<Emp> deleteById(int id) {
        return edao.deleteById(id);
    }
}

