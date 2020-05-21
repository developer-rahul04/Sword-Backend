package com.rm.dev.scopexml.scope.beans;

import javax.annotation.PostConstruct;

import com.rm.dev.scopexml.scope.NetworkAuthXml;

public class TextXml implements MessagesXml {

	private NetworkAuthXml con;

	public void sendMessage() {
		if (con.getConnection()) {
			System.out.println("Text sent " + con);
		}
	}

	@PostConstruct
	public void intialize() {
	}

	public NetworkAuthXml getCon() {
		return con;
	}

	public void setCon(NetworkAuthXml con) {
		this.con = con;
	}

}
