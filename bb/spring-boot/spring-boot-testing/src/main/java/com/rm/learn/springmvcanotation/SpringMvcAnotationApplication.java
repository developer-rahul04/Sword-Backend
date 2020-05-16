package com.rm.learn.springmvcanotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.learn.springmvcanotation.controller.MessagingController;



@SpringBootApplication
public class SpringMvcAnotationApplication {

	 private static Logger logger = LoggerFactory.getLogger(SpringMvcAnotationApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(SpringMvcAnotationApplication.class, args);
		
		MessagingController controller = context.getBean(MessagingController.class);
		
		String message = controller.sendMessaging();
		
		logger.info("MESSGAE {}",message);
		System.out.println(message);
	}

}
