/**
 * 
 */
package com.rm.learn.springdatabase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rm.learn.springdatabase.entity.Person;

/**
 * @author MISHRAR
 *
 */
@Repository
@Transactional
public class PersonDao {
	
	
	@PersistenceContext
	EntityManager entityManager;

	public Person findPersonById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public List<Person> findAllPerson() {
		TypedQuery<Person>  query =  entityManager.createNamedQuery("findAllPerson",Person.class);
			return	query.getResultList();	
	}
	
	
	public Person updateUserDetails(Person person) {
		return entityManager.merge(person);
	}
	
	public void createNewUser(Person person) {
		 entityManager.persist(person);
	}
	
	public void deleteUser(int id) {
		Person userToBeDelete = findPersonById(id);
		 entityManager.remove(userToBeDelete);
	}
	
}
