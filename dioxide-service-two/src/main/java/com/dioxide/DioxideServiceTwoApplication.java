package com.dioxide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.dioxide.feign"})
public class DioxideServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DioxideServiceTwoApplication.class, args);
    }

}
