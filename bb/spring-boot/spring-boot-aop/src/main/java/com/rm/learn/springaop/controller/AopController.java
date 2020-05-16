package com.rm.learn.springaop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rm.learn.springaop.aop.TimeTrack;
import com.rm.learn.springaop.service.AopService;

@Controller
public class AopController {
	
	@Autowired
	private AopService aopService;
	
	 private static Logger logger = LoggerFactory.getLogger(AopController.class);
	 
	 @TimeTrack
	public Boolean authenticateUser(String userId) {
		logger.info("AopController  authenticateUser " );
		return aopService.authenticateUser(userId);
		
		
	}
	

}
