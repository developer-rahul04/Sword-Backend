package com.rm.dev.singletontoprototype.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototype.scope.beans.MessagesSP;

@Component
public class MessagingScopeSP {

	@Autowired
	@Qualifier("EmailSP")
	private MessagesSP email;

	@Autowired
	@Qualifier("TextSP")
	private MessagesSP text;

	public void sendMessaging() {

		this.text.sendMessage();
		this.email.sendMessage();
		System.out.println("Email := " + email + " Text := " + text);
	}
}
