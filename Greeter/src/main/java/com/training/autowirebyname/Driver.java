package com.training.autowirebyname;

import com.training.scopes.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee=(Employee)context.getBean("employee");
        System.out.println(employee.getEmpName());
        System.out.println(employee.getAddress().getCity());
        System.out.println(employee.getAddress().getState());
        System.out.println(employee.getAddress2().getCity());
        System.out.println(employee.getAddress2().getState());
        System.out.println(employee);



        context.close();

    }

}
