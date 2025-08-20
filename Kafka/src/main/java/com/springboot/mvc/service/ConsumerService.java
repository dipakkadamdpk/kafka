package com.springboot.mvc.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.mvc.util.Util;

@Service
public class ConsumerService {
	
	@KafkaListener(topics = Util.TOPIC_NAME, groupId = Util.EDUCATION )
	public void listenToTopic(String receivedMessage) {
			System.out.println("Message received in consumer is : "+receivedMessage);
	}
	
	
}
