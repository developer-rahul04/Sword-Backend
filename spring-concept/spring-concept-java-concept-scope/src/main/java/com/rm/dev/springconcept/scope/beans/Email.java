package com.rm.dev.springconcept.scope.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.rm.dev.springconcept.scope.NetworkAuth;

@Component
@Primary
public class Email implements Messages {

	@Autowired
	private NetworkAuth con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Mail sent " + con);
		}
	}

	@PostConstruct
	public void intialize() {
		System.out.println("Email Availabilty");
	}

}
