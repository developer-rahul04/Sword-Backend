package com.rm.learn.springbootwebmvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collection;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import com.rm.learn.springbootwebmvc.controller.UserEnrollementController;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class SpringBootWebMvcApplicationTests {

	@Autowired
	UserEnrollementController controller;

	@Test
	void addUser() {

		ModelAndView modelView = controller.addUser("123", "Rahul", "IND");
		Map<String, Object> model = modelView.getModel();
		Collection<Object> obj = model.values();
		assertNotNull(obj);
		obj.forEach((x)->{
			System.out.println("User allUser " + x.toString());
		});
		
		ModelAndView modelView1 = controller.addUser("124", "Rahul", "IND2");
		Map<String, Object> model1 = modelView1.getModel();
		Collection<Object> obj1 = model1.values();
		assertNotNull(obj1);
		obj1.forEach((x)->{
			System.out.println("User allUser " + x.toString());
		});
		

		System.out.println("Before Add User");
		ModelAndView modelView2 = controller.addUser("125", "Rahul1", "IND3");
		Map<String, Object> model2 = modelView2.getModel();
		Collection<Object> obj2 = model2.values();
		assertNotNull(obj2);
		obj2.forEach((x)->{
			System.out.println("User allUser " + x.toString());
		});
	}

	@Test
	void allUser() {

		ModelAndView modelView = controller.allUser();
		Map<String, Object> model = modelView.getModel();
		Collection<Object> obj = model.values();
		assertNotNull(obj);
		obj.forEach((x)->{
			System.out.println("User allUser " + x.toString());
		});
	}
	
	@Test
	void updateUser() {

		ModelAndView modelView =  controller.updateUser("124", "Rahul1", "IND4");
		Map<String, Object> model = modelView.getModel();
		Collection<Object> obj = model.values();
		assertNotNull(obj);
		obj.forEach((x)->{
			System.out.println("User updateUser " + x.toString());
		});
		assertNotNull(obj);
	}
	
	@Test
	void deleteUser() {

		ModelAndView modelView =  controller.deleteUser("123");
		Map<String, Object> model = modelView.getModel();
		Collection<Object> obj = model.values();
		assertNotNull(obj);
		obj.forEach((x)->{
			System.out.println("User deleteUser " +  x.toString());
		});
	}

}
