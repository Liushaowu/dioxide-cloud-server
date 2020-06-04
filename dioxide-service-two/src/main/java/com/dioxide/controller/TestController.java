package com.dioxide.controller;

import com.dioxide.feign.TestFeignClient;
import com.dioxide.service.impl.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${testFeignConfig}")
    public String config;
    @Autowired
    private TestFeignClient testFeignClient;
    private final static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @GetMapping("/test")
    public String test(@RequestParam("str") String str){
        logger.info("logger: dioxide-service-two");
        return testFeignClient.hello(str);
    }
    @GetMapping("/config")
    public String config(){
        return config;
    }
}
