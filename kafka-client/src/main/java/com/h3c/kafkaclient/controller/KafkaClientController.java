package com.h3c.kafkaclient.controller;

import com.h3c.kafkaclient.producer.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("kafkaClient")
@RestController
public class KafkaClientController {

    @Autowired
    private TestProducer producer;

    @GetMapping("/createTopic")
    public String getName(){
        //TODO producer生产消息，如果topic不存在，会自动创建。
        return null;
    }

    @GetMapping("/sendMessage")
    public Boolean sendMessage(String message){
        try {
            producer.send(message);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
