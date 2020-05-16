package com.rm.learn.springmvcanotation.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Whats")
//@Primary
public class Whatsapp implements MessagesIntf {
	
	public String sendMessage() {
		
		return "Whatsapp Message Sent";
	}

}
