package com.rm.learn.springaop;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rm.learn.springaop.controller.AopController;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	 private static Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
	 
	@Autowired
	private AopController aopController;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try(Scanner sc = new Scanner(System.in);){
		logger.info(" ENTER USER ID " );    
		String userId = sc.next();
		boolean status = aopController.authenticateUser(userId);
		logger.info(" Authenitication " + status);
		} catch(Exception e) {
			logger.info(" Exception " + e.getMessage());
		}
	}

}
