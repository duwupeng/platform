package com.beizhi.cloud.ms;

import com.beizhi.cloud.ms.mq.bind.Barista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Created by eric on 16/11/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableBinding(Barista.class)
public class InputServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InputServiceApplication.class, args);
    }
}
