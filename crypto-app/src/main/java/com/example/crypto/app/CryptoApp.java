package com.example.crypto.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptoApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CryptoApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
