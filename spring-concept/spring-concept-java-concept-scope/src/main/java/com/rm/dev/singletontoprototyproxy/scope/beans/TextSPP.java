package com.rm.dev.singletontoprototyproxy.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototyproxy.scope.NetworkAuthSPP;

@Component
@Qualifier(value = "TextSPP")
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TextSPP implements MessagesSPP {

	@Autowired
	private NetworkAuthSPP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Text sent " + con);
		}
	}

}
