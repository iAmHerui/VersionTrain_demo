package com.h3c.kafkaclient.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class TestConsumer {

    @KafkaListener(topics = {"topic_test"})
    public void consumer(ConsumerRecord<?,?> consumerRecord) {

        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());

        if(kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("消费消息为: "+message);
        }
    }
}
