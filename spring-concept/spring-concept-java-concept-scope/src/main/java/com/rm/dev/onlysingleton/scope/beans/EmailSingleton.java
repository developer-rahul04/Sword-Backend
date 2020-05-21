package com.rm.dev.onlysingleton.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rm.dev.onlysingleton.scope.NetworkAuthSingleton;

@Component
@Qualifier(value = "EmailSingleton")
public class EmailSingleton implements MessagesSingletyon {

	@Autowired
	private NetworkAuthSingleton con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Mail NetworkAuth " + con);
		}
	}

}
