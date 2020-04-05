package com.dioxide.service.impl;

import com.dioxide.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String str) {
        return "hello! " + str;
    }
}
