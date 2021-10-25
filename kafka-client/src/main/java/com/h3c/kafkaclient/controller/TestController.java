package com.h3c.kafkaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello,i'm in Kafka-Client";
    }
}
