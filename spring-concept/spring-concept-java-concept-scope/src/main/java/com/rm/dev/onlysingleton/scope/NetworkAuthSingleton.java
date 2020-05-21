package com.rm.dev.onlysingleton.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class NetworkAuthSingleton {

	int id = 0;

	public NetworkAuthSingleton() {

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
