package com.rm.dev.beanconfigxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.dev.beanconfigxml.di.beans.Employee;
import com.rm.dev.beanconfigxml.di.beans.Salary;

@SpringBootApplication
class BeanConfigXmlApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BeanConfigXmlApplication.class, args);

		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee);

		Salary salary = (Salary) context.getBean("salary");

		System.out.println(salary);

	}

}
