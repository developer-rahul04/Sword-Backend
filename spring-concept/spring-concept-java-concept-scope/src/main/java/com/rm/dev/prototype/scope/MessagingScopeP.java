package com.rm.dev.prototype.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import com.rm.dev.prototype.scope.beans.MessagesP;

@Component
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MessagingScopeP {

	@Autowired
	@Qualifier("EmailP")
	private MessagesP email;

	@Autowired
	@Qualifier("TextP")
	private MessagesP text;

	public void sendMessaging() {

		this.text.sendMessage();
		this.email.sendMessage();
		System.out.println("Email := " + email + " Text := " + text);
	}
}
