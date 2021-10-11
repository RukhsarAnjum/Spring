package com.example.demo.dao;

import com.example.demo.domain.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmpDao {
    ArrayList<Emp> emps = new ArrayList<Emp>();

    public EmpDao(){
        this.emps.add(new Emp(1,"John"));
        this.emps.add(new Emp(2,"Michael"));
    }

    public ArrayList<Emp> getAllEmps(){
        return this.emps;
    }

    public ArrayList<Emp> insertEmp(Emp e){
        this.emps.add(e);
        return this.emps;
    }

    public ArrayList<Emp> deleteById(int id){
        for(int i = 0; i<this.emps.size(); i++){
            if(id == this.emps.get(i).getEmpId()){
                this.emps.remove(i);
                break;
            }
        }
        return this.emps;
    }


}
