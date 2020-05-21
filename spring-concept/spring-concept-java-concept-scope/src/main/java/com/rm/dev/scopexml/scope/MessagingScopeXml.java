package com.rm.dev.scopexml.scope;

import com.rm.dev.scopexml.scope.beans.MessagesXml;

public class MessagingScopeXml {

	public static int messageSent = 0;

	private MessagesXml message;

	public void sendMessaging() {

		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + messageSent++);
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + messageSent++);
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + messageSent++);
		this.message.sendMessage();
		System.out.println("MESSAGE Singleton " + this.message + " " + messageSent++);
	}

	public static int getMessageSent() {
		return messageSent;
	}

	public static void setMessageSent(int messageSent) {
		MessagingScopeXml.messageSent = messageSent;
	}

	public MessagesXml getMessage() {
		return message;
	}

	public void setMessage(MessagesXml message) {
		this.message = message;
	}

}
