package com.example.eureaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloserverApplication.class, args);
    }
}
