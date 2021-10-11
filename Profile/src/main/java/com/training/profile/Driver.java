package com.training.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(AppConfigs.class);
        context.refresh();

        DataSourceConfig dsConfig = (DataSourceConfig) context.getBean("dataSource");
        dsConfig.setup();


    }

}
