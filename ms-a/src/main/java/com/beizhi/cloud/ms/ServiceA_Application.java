package com.beizhi.cloud.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by eric on 16/11/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class ServiceA_Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA_Application.class, args);
    }
}
