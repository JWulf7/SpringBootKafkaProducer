package com.wulf.springbootkafkaproducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wulf.springbootkafkaproducer.kafka.KafkaProducer;
import com.wulf.springbootkafkaproducer.model.Message;

@RestController
@RequestMapping("/api/kafka")
public class Controller {
	
	
	private KafkaProducer kafkaProducer;
	
	
	// constructor injection
	public Controller(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}

	
	// http://localhost:8081/api/kafka/event/message
	@PostMapping("/event/message")
	public ResponseEntity<String> publish(@RequestBody Message message) {	
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("message sent to the topic");
	}
	
	
	
	
	
	
	
	
	
}
