package com.rm.dev.singletontoprototyproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.dev.singletontoprototyproxy.scope.MessagingScopeSPP;

@SpringBootApplication
public class SPPScopeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SPPScopeApplication.class, args);

		// SingletontoPrototype
		MessagingScopeSPP scope = context.getBean(MessagingScopeSPP.class);
		scope.sendMessaging();
		
		// SingletontoPrototype
		MessagingScopeSPP scope2 = context.getBean(MessagingScopeSPP.class);
		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

