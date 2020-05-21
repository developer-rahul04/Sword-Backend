package com.rm.dev.singletontoprototyproxy.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototyproxy.scope.NetworkAuthSPP;

@Component
@Qualifier(value="EmailSPP")
public class EmailSPP implements MessagesSPP {

	@Autowired
	private NetworkAuthSPP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Mail sent " + con);
		}
	}
}
