package com.dioxide.service.impl;

import com.dioxide.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private final static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String hello(String str) {
        logger.info("logger : dioxide-service-one ");
        return "hello! " + str;
    }
}
