package com.rm.dev.scopexml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rm.dev.scopexml.scope.MessagingScopeXml;

@SpringBootApplication
public class XmlScopePracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(XmlScopePracticeApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationScopeContext.xml");
		// Singleton
		MessagingScopeXml scope = context.getBean(MessagingScopeXml.class);

		scope.sendMessaging();
		
		// Singleton
		MessagingScopeXml scope2 = context.getBean(MessagingScopeXml.class);

		scope.sendMessaging();
		
		if(scope == scope2) {
			System.out.println("MessagingScope Singletoon Passed");
		}
	
	}

}

