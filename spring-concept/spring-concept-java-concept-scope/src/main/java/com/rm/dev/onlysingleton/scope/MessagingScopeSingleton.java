package com.rm.dev.onlysingleton.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.onlysingleton.scope.beans.MessagesSingletyon;

@Component
public class MessagingScopeSingleton {

	@Autowired
	@Qualifier("EmailSingleton")
	private MessagesSingletyon email;

	@Autowired
	@Qualifier("TextSingleton")
	private MessagesSingletyon text;

	public void sendMessaging() {

		this.text.sendMessage();
		this.email.sendMessage();
		System.out.println("Email := " + email + " Text := " + text);
	}

}
