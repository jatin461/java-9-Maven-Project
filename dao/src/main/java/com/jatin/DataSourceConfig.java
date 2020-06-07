package com.jatin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@SpringBootApplication
@Configuration
@PropertySource("application.properties")
public class DataSourceConfig {

    @Autowired
    Environment env;

    @Bean
    DataSource datasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin1234");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/multi-module-maven-java9");
        return dataSource;
    }
}
