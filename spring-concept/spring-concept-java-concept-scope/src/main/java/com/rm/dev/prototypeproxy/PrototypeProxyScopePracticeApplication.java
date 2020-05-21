package com.rm.dev.prototypeproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.dev.prototypeproxy.scope.MessagingScopePP;

@SpringBootApplication
public class PrototypeProxyScopePracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PrototypeProxyScopePracticeApplication.class, args);

		// PrototypepROXY
		MessagingScopePP scope = context.getBean(MessagingScopePP.class);

		scope.sendMessaging();
		
		// Prototype pROXY
		MessagingScopePP scope2 = context.getBean(MessagingScopePP.class);

		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

