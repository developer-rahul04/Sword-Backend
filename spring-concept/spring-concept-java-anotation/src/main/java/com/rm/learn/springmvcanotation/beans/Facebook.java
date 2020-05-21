package com.rm.learn.springmvcanotation.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="facebook")
public class Facebook implements MessagesIntf {
	
	public String sendMessage() {
		return "Facebook Message Sent";
	}
}
