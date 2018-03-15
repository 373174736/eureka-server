package com.lizl.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lizhaoliang on 18/2/1.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
    public static void main(String args[]){
        SpringApplication.run(EurekaServer.class, args);
    }
}
