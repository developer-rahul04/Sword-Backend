package com.rm.learn.springmvcanotation.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Facebook implements MessagesIntf {
	
	public String sendMessage() {
		
		return "Facebook Message Sent";
	}

}
