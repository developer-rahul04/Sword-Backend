package com.rm.dev.singletontoprototyproxy.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototyproxy.scope.beans.MessagesSPP;

@Component
public class MessagingScopeSPP {

	@Autowired
	@Qualifier("EmailSPP")
	private MessagesSPP email;

	@Autowired
	@Qualifier("TextSPP")
	private MessagesSPP text;

	public void sendMessaging() {

		this.text.sendMessage();
		this.email.sendMessage();
		System.out.println("Email := " + email + " Text := " + text);
	}
}
