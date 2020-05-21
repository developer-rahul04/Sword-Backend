package com.controller;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.LoginService;


@Controller
public class LoginServlet extends HttpServlet {
	
	  static Logger log = Logger.getLogger(LoginServlet.class.getName());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	public LoginService servicea ;
	
	@RequestMapping("/login")
	private static String getFirstPage() {
		return "Login";
	}
	
	@RequestMapping("/")
	private static String getErrorPage() {
		return "first";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	//@ResponseBody
	private String getWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap map) {
		log.info("Inside getWelcomePage");
		if(servicea.validateUser(name, password)) {
			map.put("name",  name);
			log.info("Inside welcome");
			return "welcome";
		} else {
			log.info("Inside name");
			map.put("name",  name);
			return "error";
		}
	}
}