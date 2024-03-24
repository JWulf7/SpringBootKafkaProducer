package com.wulf.springbootkafkaproducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	
	// using constructor based dependency injection
	private KafkaTemplate<String, String> kafkaTemplate;

	// single constructor so can omit @Autowired
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage() {
		
		String topic = "myTopic.restCall";
	}
	

}
