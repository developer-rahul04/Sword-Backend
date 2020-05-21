package com.rm.dev.beanconfigxml.di.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class Employee implements Company, BeanNameAware, DisposableBean {

	private String name;

	private String age;

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name " + name);
	}

	public void init() {
		System.out.println("init Employee called");
		this.name = "RAHUL";
		this.age = "20";
	}

	public void destroy() {
		System.out.println("destroy Employee called");
		this.name = null;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
