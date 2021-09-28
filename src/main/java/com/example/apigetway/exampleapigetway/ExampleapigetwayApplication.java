package com.example.apigetway.exampleapigetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExampleapigetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleapigetwayApplication.class, args);
    }

}
