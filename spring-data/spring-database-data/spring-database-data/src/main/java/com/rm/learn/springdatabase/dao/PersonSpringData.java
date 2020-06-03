package com.rm.learn.springdatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rm.learn.springdatabase.entity.Person;

public interface PersonSpringData extends JpaRepository<Person, Integer> {

}
