package com.rm.learn.springdatabase;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rm.learn.springdatabase.dao.PersonSpringData;
import com.rm.learn.springdatabase.entity.Person;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner  {

	private Logger logger = LoggerFactory.getLogger(SpringDataApplication.class);

	@Autowired
	PersonSpringData personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(1000);
		Optional<Person> person = personDao.findById(10001);
		System.out.println("All User => " + person);
		
		Person newPerson = new Person(100011,"vivek","gkp",new Date(2020,10,1));
		Person newPerson2 = new Person(100012,"vivek2","gkp2",new Date(2220,10,1));
		Person newPerson3 = new Person(100013,"vivek3","gkp3",new Date(2220,10,1));
		Person newPerson4 = new Person(100014,"vivek4","gkp4",new Date(2220,10,1));
		personDao.save(newPerson);
		personDao.save(newPerson2);
		personDao.save(newPerson3);
		personDao.save(newPerson4);
		
		Person updatedPerson = new Person(10001,"vivek44","gkp44",new Date(2220,10,1));
		personDao.save(updatedPerson);
		
		personDao.deleteById(100014);
		
		List<Person> personAllList  = personDao.findAll();
		
		personAllList.forEach((x)->{
			System.out.println(x);
		});
	}

}
