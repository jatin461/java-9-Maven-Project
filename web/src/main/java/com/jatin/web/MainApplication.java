package com.jatin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class,
        DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.jatin.entity", "com.java9.entity", "com.jatin.service", "com.jatin"})
@EnableJpaRepositories(basePackages = {"com.jatin.dao"})
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Inside mainn Method");
        SpringApplication.run(MainApplication.class, args);
    }
}
