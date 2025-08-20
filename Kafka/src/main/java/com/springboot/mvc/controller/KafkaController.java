package com.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.service.ProducerService;





@RestController
@RequestMapping("/rest/api")
public class KafkaController {
	
	@Autowired
	ProducerService producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}
	

}
