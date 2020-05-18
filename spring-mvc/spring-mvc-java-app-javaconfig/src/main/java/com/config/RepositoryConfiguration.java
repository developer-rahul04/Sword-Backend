/*package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

	@Configuration
	public class RepositoryConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public LocalSessionFactoryBean sessionFactory(){        
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource());
	    sessionFactory.setPackagesToScan(new String[] {"com.kharoud.model"});
	    sessionFactory.setHibernateProperties(hibernateProperties());
	    return sessionFactory;
	}

	@Bean
	public Properties hibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.dialect",      environment.getRequiredProperty("hibernate.dialect"));
	    properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
	    properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
	    return properties;
	}

	@Bean
	public DataSource dataSource() {        
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
	    dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
	    dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
	    dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
	    return dataSource;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
	   HibernateTransactionManager txManager = new   HibernateTransactionManager();
	   txManager.setSessionFactory(s);
	   return txManager;
	}
}
*/