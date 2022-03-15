package com.example.websocketserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApplicationStartup {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
