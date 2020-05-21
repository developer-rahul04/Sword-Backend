package com.rm.dev.singletontoprototype.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototype.scope.NetworkAuthSP;

@Component
@Qualifier(value="EmailSP")
public class EmailSP implements MessagesSP {

	@Autowired
	private NetworkAuthSP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Mail sent " + con);
		}
	}
}
