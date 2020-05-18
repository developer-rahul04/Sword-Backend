package com.rm.dev.springconcept.di.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Facebook implements Messages ,BeanNameAware{
	
	public void sendMessage() {
		
		System.out.println("FACEBOOK SENDING MESSAGE");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("name " + name);
		
	}

}
