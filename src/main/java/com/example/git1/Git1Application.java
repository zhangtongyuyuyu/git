package com.example.git1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Git1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Git1Application.class, args);
    }
    @Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(Git1Application.class);

    }
}
