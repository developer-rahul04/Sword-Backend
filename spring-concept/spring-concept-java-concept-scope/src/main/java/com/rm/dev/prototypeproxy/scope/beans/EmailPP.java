package com.rm.dev.prototypeproxy.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.rm.dev.prototypeproxy.scope.NetworkAuthPP;

@Component
@Qualifier(value = "EmailPP")
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EmailPP implements MessagesPP {

	@Autowired
	private NetworkAuthPP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Mail sent " + con);
		}
	}

}
