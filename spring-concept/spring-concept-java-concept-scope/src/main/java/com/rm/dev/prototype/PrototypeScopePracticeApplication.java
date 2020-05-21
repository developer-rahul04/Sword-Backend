package com.rm.dev.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.dev.prototype.scope.MessagingScopeP;

@SpringBootApplication
public class PrototypeScopePracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PrototypeScopePracticeApplication.class, args);

		// Prototype
		MessagingScopeP scope = context.getBean(MessagingScopeP.class);

		scope.sendMessaging();
		
		// Prototype
		MessagingScopeP scope2 = context.getBean(MessagingScopeP.class);

		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

