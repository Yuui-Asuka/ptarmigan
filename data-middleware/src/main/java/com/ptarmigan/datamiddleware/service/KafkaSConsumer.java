package com.ptarmigan.datamiddleware.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaSConsumer {
    @KafkaListener(topics = "my_topic", groupId = "my_consumer_group")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}