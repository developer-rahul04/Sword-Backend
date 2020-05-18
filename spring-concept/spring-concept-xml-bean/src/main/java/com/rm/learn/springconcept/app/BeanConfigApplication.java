package com.rm.learn.springconcept.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.learn.springconcept.di.beans.Employee;
import com.rm.learn.springconcept.di.beans.Salary;

@SpringBootApplication
@ComponentScan("com.rm.learn.springconcept")
class BeanConfigApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BeanConfigApplication.class, args);

		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee);

		Salary salary = (Salary) context.getBean("salary");

		System.out.println(salary);

	}

}
