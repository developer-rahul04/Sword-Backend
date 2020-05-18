package com.rm.dev.springconcept.scope.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.rm.dev.springconcept.scope.NetworkAuth;

@Component
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Text implements Messages {

	@Autowired
	private NetworkAuth con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Text sent " + con);
		}
	}

	@PostConstruct
	public void intialize() {
	}

}
