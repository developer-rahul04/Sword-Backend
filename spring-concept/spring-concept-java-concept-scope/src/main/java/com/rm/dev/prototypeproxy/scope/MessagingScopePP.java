package com.rm.dev.prototypeproxy.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.rm.dev.prototypeproxy.scope.beans.MessagesPP;

@Component
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MessagingScopePP {

	@Autowired
	@Qualifier("EmailPP")
	private MessagesPP email;

	@Autowired
	@Qualifier("TextPP")
	private MessagesPP text;

	public void sendMessaging() {

		this.text.sendMessage();
		this.email.sendMessage();
		System.out.println("Email := " + email + " Text := " + text);
	}
}
