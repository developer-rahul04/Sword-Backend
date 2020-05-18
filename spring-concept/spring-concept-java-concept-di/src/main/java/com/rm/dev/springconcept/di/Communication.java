package com.rm.dev.springconcept.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.springconcept.di.beans.Messages;

@Component
public class Communication {
	 
	public static int messageSent = 0;
	
	// Autowire by Type
/*	@Autowired
	private Messages message;*/
	
	// Autowire by Name
	@Autowired
	@Qualifier(value="Whats")
	private Messages facebook;
	
	@Autowired
	@Qualifier(value="Whats")
	private Messages whatsapp;
	
	public void sendMessaging() {
		
		messageSent ++;
		
		this.facebook.sendMessage();
		System.out.println(" COUNT >>>" + messageSent);
		this.whatsapp.sendMessage();
		System.out.println(" COUNT >>>" + messageSent);
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
