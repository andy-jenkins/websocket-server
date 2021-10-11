package com.example.websocketserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
        "com.example.websocketserver"
    }
)
public class ApplicationStartup {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}