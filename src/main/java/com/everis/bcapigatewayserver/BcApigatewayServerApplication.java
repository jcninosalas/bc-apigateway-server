package com.everis.bcapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BcApigatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcApigatewayServerApplication.class, args);
    }

}
