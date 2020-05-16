package com.rm.learn.springbootuserenrollment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootUserEnrollmentApplication {
	
	Logger logger = LoggerFactory.getLogger(SpringBootUserEnrollmentApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootUserEnrollmentApplication.class, args);
	}
}
