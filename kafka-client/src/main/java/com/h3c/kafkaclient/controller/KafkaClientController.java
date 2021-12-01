package com.h3c.kafkaclient.controller;

import com.h3c.kafkaclient.producer.UserLogProducer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Kafka Client接口",tags = "Kafka Client接口")
@RequestMapping("kafkaClient")
@RestController
public class KafkaClientController {

    @Autowired
    private UserLogProducer kafkaSender;

    @ApiOperation(value = "生产消息",notes = "发送数据")
    @GetMapping("/sendMessage")
    public Boolean sendMessage(String userid){
        try {
            kafkaSender.sendLog(userid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
