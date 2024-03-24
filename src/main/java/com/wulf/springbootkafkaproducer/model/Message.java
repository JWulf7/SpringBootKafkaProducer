package com.wulf.springbootkafkaproducer.model;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private int id;
	
	private String userName;
	
	private String message;
	
	public Message() {
		
	}
	
	public Message(int id, String userName, String message) {
		super();
		this.id = id;
		this.userName = userName;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", userName=" + userName + ", message=" + message + "]";
	}
	
	
	
}
