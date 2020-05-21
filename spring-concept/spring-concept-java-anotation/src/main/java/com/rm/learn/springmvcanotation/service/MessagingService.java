package com.rm.learn.springmvcanotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rm.learn.springmvcanotation.beans.MessagesIntf;

@Service
public class MessagingService {

	public static int messageSent = 0;

	@Autowired
	@Qualifier(value="facebook")
	private MessagesIntf message;

	public String sendMessaging() {
		return this.message.sendMessage();
	}

}
