package com.h3c.redisclient.controller;

import com.h3c.redisclient.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("redisClient")
@RestController
public class RedisClientController {

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/insert")
    public Boolean insert(String key,String value){
        return redisUtils.set(key, value);
    }

    @GetMapping("/select")
    public String select(String key){
        return redisUtils.get(key);
    }

    @GetMapping("/update")
    public Boolean update(String key,String value){
        return redisUtils.update(key, value);
    }

    @GetMapping("/delete")
    public Boolean delete(String key){
        return redisUtils.delete(key);
    }
}
