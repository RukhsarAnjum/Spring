package com.example.Exceptionhandling.service;

import com.example.Exceptionhandling.dao.EmpDao;
import com.example.Exceptionhandling.domain.Emp;
import com.example.Exceptionhandling.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<Emp> deleteById(int id) throws RecordNotFoundException {
        //return edao.deleteById(id);
        List<Emp> list=new ArrayList<Emp>();
        if(list.size()==0){
            throw new RecordNotFoundException("Item cannot be declare");
        }
        return (ArrayList<Emp>) list;
    }
}

