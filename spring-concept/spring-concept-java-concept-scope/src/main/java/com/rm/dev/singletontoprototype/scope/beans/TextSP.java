package com.rm.dev.singletontoprototype.scope.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import com.rm.dev.singletontoprototype.scope.NetworkAuthSP;

@Component
@Qualifier(value="TextSP")
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TextSP implements MessagesSP {

	@Autowired
	private NetworkAuthSP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Text sent " + con);
		}
	}

	@PostConstruct
	public void intialize() {
	}

}
