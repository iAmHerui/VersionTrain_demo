package com.h3c.kafkaclient.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String producerMessage) {
        kafkaTemplate.send("topic_test",producerMessage);
    }
}
