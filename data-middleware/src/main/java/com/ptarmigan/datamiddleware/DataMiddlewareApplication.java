package com.ptarmigan.datamiddleware;

import com.ptarmigan.datamiddleware.service.KafkaSConsumer;
import com.ptarmigan.datamiddleware.service.KafkaSProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMiddlewareApplication.class, args);

	}

}
