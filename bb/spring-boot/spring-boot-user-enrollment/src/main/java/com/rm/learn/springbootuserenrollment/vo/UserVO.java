package com.rm.learn.springbootuserenrollment.vo;

public class UserVO {

	private String id;

	private String name;

	private String country;

	public UserVO(String id2, String name, String country) {
		super();
		this.id = id2;
		this.name = name;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
