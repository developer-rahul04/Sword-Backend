package com.rm.dev.scopexml.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkAuthXml {

	int id = 0;

	public NetworkAuthXml() {

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
