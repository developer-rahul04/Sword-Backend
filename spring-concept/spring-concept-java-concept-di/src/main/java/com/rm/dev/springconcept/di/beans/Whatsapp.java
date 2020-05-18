package com.rm.dev.springconcept.di.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Whats")
//@Primary
public class Whatsapp implements Messages {
	
	public void sendMessage() {
		
		System.out.println("Whatsapp SENDING MESSAGE");
	}

}
