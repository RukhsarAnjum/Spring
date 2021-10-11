package com.training.autowirebytype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
        Employee employee=(Employee)context.getBean("employee");
        System.out.println(employee.getEmpName());
        System.out.println(employee.getAddress().getCity());
        System.out.println(employee.getAddress().getState());


        context.close();

    }

}
