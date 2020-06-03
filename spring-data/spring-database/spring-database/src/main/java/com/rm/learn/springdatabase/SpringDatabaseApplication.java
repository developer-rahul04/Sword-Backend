package com.rm.learn.springdatabase;


import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rm.learn.springdatabase.dao.PersonDao;
import com.rm.learn.springdatabase.entity.Person;

@SpringBootApplication
public class SpringDatabaseApplication implements CommandLineRunner  {

	private Logger logger = LoggerFactory.getLogger(SpringDatabaseApplication.class);

	@Autowired
	PersonDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(1000);
		List<Person> person = personDao.getAllPerson();
		System.out.println("All User => " + person);
		
		Person person1 = personDao.getAllPersonById(10001);
		System.out.println("GET SPECIFIC PERSON " + person1);
		
		int numberOfRowDeleted = personDao.deleteById(10002);
		System.out.println("Number of Row Deleted " + numberOfRowDeleted);
		
		
		Person personUpdated = new Person(1005,"vivek","gkp",new Date(2020,10,1));
		personDao.addPerson(personUpdated);
		
		Person updated = new Person(10001,"vivek1","gkp1",new Date(2120,10,1));
		personDao.updatePerson(updated);
		
		
		List<Person> person4 = personDao.getAllPersonJDBC();
		System.out.println("All User JDBC => " + person4);
		
		
	}

}
