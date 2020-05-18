package com.rm.dev.springconcept.scope;

import org.springframework.stereotype.Component;

import com.rm.dev.springconcept.scope.beans.Messages;

public class MessagingScope {

	public static int messageSent = 0;
	
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


	public Messages getMessage() {
		return message;
	}


	public void setMessage(Messages message) {
		this.message = message;
	}
	
	

}
