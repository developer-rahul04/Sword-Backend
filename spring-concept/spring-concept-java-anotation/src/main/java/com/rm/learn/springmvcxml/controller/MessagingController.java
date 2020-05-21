package com.rm.learn.springmvcxml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rm.learn.springmvcxml.service.MessagingService;

@Controller
public class MessagingController {

	@Autowired
	private MessagingService service;
	
	
	public String sendMessaging() {
		
		return service.sendMessaging();
	}
}
