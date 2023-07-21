package com.ptarmigan.datamiddleware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}