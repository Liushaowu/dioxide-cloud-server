package com.dioxide.controller;

import com.dioxide.feign.TestFeignClient;
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
    @GetMapping("/test")
    public String test(@RequestParam("str") String str){
           return testFeignClient.hello(str);
    }
    @GetMapping("/config")
    public String config(){
        return config;
    }
}
