package com.ptarmigan.datamiddleware.controller;


import com.ptarmigan.datamiddleware.service.KafkaSProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka")
public class KafkaController{

    @Autowired
    KafkaSProducer kafkaSProducer;


    @RequestMapping("test")
    public void topicTest(){
        kafkaSProducer.sendMessage("my_topic", "hello");
    }

}
