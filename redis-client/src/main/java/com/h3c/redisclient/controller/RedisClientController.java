package com.h3c.redisclient.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

@Api(value = "Redis Client接口",tags = "Redis Client接口")
@RequestMapping("redisClient")
@RestController
public class RedisClientController {

    @Autowired
    private JedisCluster jedisCluster;

    @ApiOperation(value = "添加数据",notes = "添加数据")
    @GetMapping("/insert")
    public String insert(String key,String value){
        return jedisCluster.set(key, value);
    }

    @ApiOperation(value = "查询数据",notes = "查询数据")
    @GetMapping("/select")
    public String select(String key){
        return jedisCluster.get(key);
    }

    @ApiOperation(value = "更新数据",notes = "更新数据")
    @GetMapping("/update")
    public Boolean update(String key,String value){
        return false;
    }

    @ApiOperation(value = "删除数据",notes = "删除数据")
    @GetMapping("/delete")
    public Boolean delete(String key){
        return false;
    }
}
