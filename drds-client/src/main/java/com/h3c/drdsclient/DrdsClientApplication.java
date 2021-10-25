package com.h3c.drdsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrdsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrdsClientApplication.class, args);
    }

}
