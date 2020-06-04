package com.dioxide.controller;

import com.dioxide.service.TestService;
import com.dioxide.utils.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public String test(@RequestParam("str") String str){
        System.out.println("请求了一次");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //throw new RuntimeException("错误信息");
        TestUtils.testUtils();
        return testService.hello(str);
    }
}
