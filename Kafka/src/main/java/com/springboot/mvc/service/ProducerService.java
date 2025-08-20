package com.springboot.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.springboot.mvc.util.Util;

@Service
public class ProducerService {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;  //1st param - name of the topic & 2nd- message 

	public void sendMsgToTopic(String message) {
		kafkaTemplate.send(Util.TOPIC_NAME, message);
	}
	
	
}
