package com.rm.learn.springmvcxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.learn.springmvcxml.beans.MessagesIntf;

@Service
public class MessagingService {

	public static int messageSent = 0;

	@Autowired
	private MessagesIntf message;

	public String sendMessaging() {
		return this.message.sendMessage();
	}

}
