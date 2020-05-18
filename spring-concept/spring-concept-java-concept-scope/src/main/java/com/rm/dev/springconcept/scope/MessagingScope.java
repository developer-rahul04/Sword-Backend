package com.rm.dev.springconcept.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.springconcept.scope.beans.Messages;

@Component
public class MessagingScope {

	public static int messageSent = 0;
	

	// Autowire by Name
	@Autowired
	@Qualifier("text")
	private Messages message;


	public void sendMessaging() {
	

		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + 	messageSent++);
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + 	messageSent++);
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + 	messageSent++ );
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + 	messageSent++);
	}

}
