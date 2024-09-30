package com.kr.cground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CgroudSpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgroudSpringCloudEurekaApplication.class, args);
    }

}
