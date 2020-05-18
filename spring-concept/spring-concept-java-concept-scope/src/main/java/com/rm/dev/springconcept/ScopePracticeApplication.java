package com.rm.dev.springconcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.dev.springconcept.scope.MessagingScope;

@SpringBootApplication
@ComponentScan("com.rm.dev.springconcept")
public class ScopePracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ScopePracticeApplication.class, args);

		// Singleton
		MessagingScope scope = context.getBean(MessagingScope.class);

		scope.sendMessaging();
		
		// Singleton
		MessagingScope scope2 = context.getBean(MessagingScope.class);

		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

