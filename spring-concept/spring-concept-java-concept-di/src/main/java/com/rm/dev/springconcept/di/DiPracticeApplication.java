package com.rm.dev.springconcept.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
 class DiPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiPracticeApplication.class, args);

		Communication com = context.getBean(Communication.class);

		com.sendMessaging();
		
		Communication com1 = context.getBean(Communication.class);
		
		com1.sendMessaging();
	}

}

