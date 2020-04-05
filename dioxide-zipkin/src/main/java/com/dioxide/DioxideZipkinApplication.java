package com.dioxide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class DioxideZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(DioxideZipkinApplication.class, args);
    }

}
