package com.rm.learn.springconcept.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.learn.springconcept.di.beans.Company;
import com.rm.learn.springconcept.di.beans.Employee;
import com.rm.learn.springconcept.di.beans.Salary;

@SpringBootApplication
@ComponentScan("com.rm.learn.springconcept")
class BeanAnnotationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BeanAnnotationApplication.class, args);

		Company companySal = (Salary) context.getBean("salary");
		System.out.println(companySal);

		Company companyEmp = (Employee) context.getBean("employee");
		System.out.println(companyEmp);
		
		Company companySal1 = (Salary) context.getBean(Salary.class);
		System.out.println(companySal);

		Company companyEmp1 = (Employee) context.getBean(Employee.class);
		System.out.println(companyEmp);


	}

}
