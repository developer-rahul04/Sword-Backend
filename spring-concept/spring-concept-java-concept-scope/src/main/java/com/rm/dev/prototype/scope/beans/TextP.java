package com.rm.dev.prototype.scope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.rm.dev.prototype.scope.NetworkAuthP;

@Component
@Qualifier(value = "TextP")
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TextP implements MessagesP {

	@Autowired
	private NetworkAuthP con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Text sent " + con);
		}
	}

}
