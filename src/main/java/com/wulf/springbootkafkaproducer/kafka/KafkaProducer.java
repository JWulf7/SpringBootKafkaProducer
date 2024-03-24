package com.wulf.springbootkafkaproducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.wulf.springbootkafkaproducer.model.Message;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	
	// using KafkaTemplate from springboot b/c auto-configures template to send message to kafka broker
	// using constructor based dependency injection
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@Autowired
    private ObjectMapper objectMapper;

	// single constructor so can omit @Autowired
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	public void sendMessage(Message message) {
		String topic = "myTopic.restCall";
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send(topic, getJsonString(message));
		
	}
	
	
	private String getJsonString(Message message) {
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            LOGGER.error("JsonProcessingException | e", e);
        }
        return jsonString;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
