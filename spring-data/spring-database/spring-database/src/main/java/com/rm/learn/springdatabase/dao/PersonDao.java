/**
 * 
 */
package com.rm.learn.springdatabase.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rm.learn.springdatabase.entity.Person;

/**
 * @author MISHRAR
 *
 */
@Repository
public class PersonDao {
	
	
	class PersonMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("ID"));
			person.setName(rs.getString("NAME"));
			person.setLocation(rs.getString("LOCATION"));
			person.setBirth_date(rs.getDate("BIRTH_DATE"));
			return person;
		}
		
	}
	

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> getAllPerson() {

		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));

	}
	

	public List<Person> getAllPersonJDBC() {

		return jdbcTemplate.query("select * from person", new PersonMapper());

	}

	public Person getAllPersonById(int id) {

		return jdbcTemplate.queryForObject("select * from person where id = ? ", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));

	}

	public int deleteById(int id) {

		return jdbcTemplate.update("delete from person where id = ?", new Object[] { id });

	}

	public int addPerson(Person person) {

		return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )  VALUES(?,?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(), person.getBirth_date() });

	}
	
	public int updatePerson(Person person) {

		return jdbcTemplate.update("UPDATE  PERSON SET  NAME = ? , LOCATION = ?   WHERE ID = ?",
				new Object[] {person.getName(), person.getLocation(),  person.getId() });

	}

}
