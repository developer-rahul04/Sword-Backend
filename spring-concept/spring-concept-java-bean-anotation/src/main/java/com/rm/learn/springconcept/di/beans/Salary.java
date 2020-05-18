package com.rm.learn.springconcept.di.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;


public class Salary implements Company, BeanNameAware {
	
	private String amount;
	
	@Autowired
	private Employee employee;

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
	
	@Override
	public String toString() {
		return "Salary [amount=" + amount + ", employee=" + employee + "]";
	}
	
	public void init() {
		System.out.println("init Salary called");
		this.amount = "100";
	}
	
	public void destroy() {
		System.out.println("destroy Salary called");
		this.amount = null;
	}
	
	

}
