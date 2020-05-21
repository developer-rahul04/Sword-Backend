package com.rm.dev.beansconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rm.dev.beansconfig.di.beans.Company;
import com.rm.dev.beansconfig.di.beans.Employee;
import com.rm.dev.beansconfig.di.beans.Salary;

@SpringBootApplication
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
