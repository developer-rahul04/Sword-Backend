package com.rm.dev.singletontoprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.dev.singletontoprototype.scope.MessagingScopeSP;

@SpringBootApplication
public class SPScopeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SPScopeApplication.class, args);

		// SingletontoPrototype
		MessagingScopeSP scope = context.getBean(MessagingScopeSP.class);
		scope.sendMessaging();
		
		// SingletontoPrototype
		MessagingScopeSP scope2 = context.getBean(MessagingScopeSP.class);
		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

