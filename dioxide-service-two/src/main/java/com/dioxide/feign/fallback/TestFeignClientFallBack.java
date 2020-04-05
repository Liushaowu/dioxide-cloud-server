package com.dioxide.feign.fallback;

import com.dioxide.feign.TestFeignClient;
import org.springframework.stereotype.Component;

@Component
public class TestFeignClientFallBack implements TestFeignClient {
    @Override
    public String hello(String str) {
        return "fail";
    }
}
