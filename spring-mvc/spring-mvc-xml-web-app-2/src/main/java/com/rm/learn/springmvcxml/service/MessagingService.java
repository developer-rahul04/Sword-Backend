package com.rm.learn.springmvcanotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.learn.springmvcanotation.beans.MessagesIntf;

@Service
public class MessagingService {
	
	
	 
	public static int messageSent = 0;
	
	// Autowire by Type
/*	@Autowired
	private Messages message;*/
	
	// Autowire by Name
	@Autowired
	private MessagesIntf message;

	
	
	
	public String sendMessaging() {
		return this.message.sendMessage();
	}

	/*	// Setter Constructor
	public void setMessages(Messages msg) {
		this.message = msg;
	}*/
	
	
/*	// Constructor Injection
	public Communication(Messages msg) {
		this.message = msg;
	}
	*/
	
}
