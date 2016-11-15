package com.beizhi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by eric on 16/11/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EmailService_Application {
    public static void main(String[] args) {
        SpringApplication.run(EmailService_Application.class, args);
    }
}
