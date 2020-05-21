package com.rm.dev.onlysingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.dev.onlysingleton.scope.MessagingScopeSingleton;
import com.rm.dev.onlysingleton.scope.beans.EmailSingleton;
import com.rm.dev.springconcept.scope.MessagingScope;

@SpringBootApplication
@ComponentScan("com.rm.dev.onlysingleton")
public class SingletonScope {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SingletonScope.class, args);
		
		EmailSingleton email = context.getBean(EmailSingleton.class);

		// Singleton
		MessagingScopeSingleton scope = context.getBean(MessagingScopeSingleton.class);
		scope.sendMessaging();
		
		// Singleton
		MessagingScopeSingleton scope2 = context.getBean(MessagingScopeSingleton.class);
		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

