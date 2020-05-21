package com.rm.dev.prototype.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NetworkAuthP {

	int id = 0;

	public NetworkAuthP() {

	}

	public boolean getConnection() {
		return this.id != 0 ? true : false;
	}

	@PostConstruct
	public void intialize() {
		this.id = 1;
	}

	@PreDestroy
	public void close() {
		this.id = 0;
	}

}
