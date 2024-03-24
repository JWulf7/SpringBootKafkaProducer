package com.wulf.springbootkafkaproducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class Controller {

	// http://localhost:8081/api/kafka/event/message?
	@PostMapping("/event/{message}")
	public ResponseEntity<String> publish(@PathVariable("message")String message) {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
