package com.training.greeterwithannotationbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String args[]){
        AbstractApplicationContext factory =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Greeter g = factory.getBean("greeter", Greeter.class);
        System.out.println("Got greeter " + g);
        g.greet();
        factory.close();
    }

}


