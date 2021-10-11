package com.training.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-xml.xml");
        Student student=(Student)context.getBean("student");
        student.getName();
        student.getCity();

//        StudentAddress studentAddress=(StudentAddress) context.getBean("studentAddress");
//        studentAddress.getCity();
    }
}
