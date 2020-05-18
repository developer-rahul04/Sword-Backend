package com.rm.learn.springmvcanotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rm.learn.springmvcanotation.controller.MessagingController;

@Configuration
@ComponentScan("com.rm.learn.springmvcanotation")
public class SpringMvcAnotationApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringMvcAnotationApplication.class);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringMvcAnotationApplication.class);

		MessagingController controller = context.getBean(MessagingController.class);

		String message = controller.sendMessaging();

		logger.info("MESSGAE {}", message);
		System.out.println(message);
	}

}
