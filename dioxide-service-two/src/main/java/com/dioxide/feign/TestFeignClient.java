package com.dioxide.feign;

import com.dioxide.feign.fallback.TestFeignClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dioxide-service-one",fallback = TestFeignClientFallBack.class)
public interface TestFeignClient {
     @RequestMapping(value = "/test",method = RequestMethod.GET)
     String hello(@RequestParam("str") String str);
}
