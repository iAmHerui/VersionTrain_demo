package com.h3c.kafkaclient.producer;

import com.alibaba.fastjson.JSON;
import com.h3c.kafkaclient.entity.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserLogProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendLog(String userid) {
        UserLog userLog = new UserLog();
        userLog.setUsername("version train").setUserid(userid).setState("0");
        kafkaTemplate.send("user-log", JSON.toJSONString(userLog));
    }
}
