package com.dariaeld.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.daria.eld.school")
@EnableJpaRepositories(basePackages = "com.daria.eld.school")
@ComponentScan(basePackages = {"com.daria.eld.school."})
@EntityScan(basePackages = "com.daria.eld.school.controller")
public class SchoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }
}
