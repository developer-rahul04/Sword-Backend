package com.rm.learn.springmvcanotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rm.learn.springmvcanotation.controller.MessagingController;

public class SpringMvcXmlApplication {

	 private static Logger LOGGER = LoggerFactory.getLogger(SpringMvcXmlApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessagingController controller = context.getBean(MessagingController.class);
		
		String message = controller.sendMessaging();
		
		LOGGER.info("MESSGAE {}",message);
		System.out.println(message);
	}

}
