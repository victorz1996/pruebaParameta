package com.example.pruebaparameta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
public class PruebaParametaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaParametaApplication.class, args);
    }

}
