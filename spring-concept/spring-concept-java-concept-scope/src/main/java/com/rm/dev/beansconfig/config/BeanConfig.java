package com.rm.dev.beansconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rm.dev.beansconfig.di.beans.Employee;
import com.rm.dev.beansconfig.di.beans.Salary;

@Configuration
public class BeanConfig {
 

    @Bean(name = "salary" , initMethod="init", destroyMethod="destroy")
    public Salary getSalaryBean() {
        return new Salary();
    }
    
    @Bean(name = "employee" , initMethod="init", destroyMethod="destroy")
    public Employee getEmployeeBean() {
        return new Employee();
    }    

}

