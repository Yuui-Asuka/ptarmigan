package com.ptarmigan.datamiddleware.service;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

public class KafkaProducer {
    public static void main(String[] args) {
        // 配置Kafka生产者的属性
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        // 创建Kafka生产者
        Producer<String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer<>(properties);

        // 创建消息
        ProducerRecord<String, String> record = new ProducerRecord<>("my_topic", "key", "Hello Kafka!");

        // 发送消息
        producer.send(record, new Callback() {
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception != null) {
                    exception.printStackTrace();
                } else {
                    System.out.println("Message sent successfully! Offset: " + metadata.offset());
                }
            }
        });

        // 关闭生产者
        producer.close();
    }
}
