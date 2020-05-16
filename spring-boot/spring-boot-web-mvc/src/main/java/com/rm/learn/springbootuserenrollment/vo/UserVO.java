package com.rm.learn.springbootuserenrollment.vo;

public class UserVO {

	private String id;

	private String name;

	private String country;


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

	public UserVO(String id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	

}
