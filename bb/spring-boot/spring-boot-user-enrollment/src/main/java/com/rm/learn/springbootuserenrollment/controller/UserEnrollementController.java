package com.rm.learn.springbootuserenrollment.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rm.learn.springbootuserenrollment.service.UserEnrollementService;
import com.rm.learn.springbootuserenrollment.vo.UserVO;

@RestController
public class UserEnrollementController {

	@Autowired
	private UserEnrollementService service;

	@GetMapping(value= "/getUserDetails/{id}")
	public List<UserVO> getUserDetails(@PathVariable("id") String id) {
		System.out.println("REQUEST PARAMS " + id);
		UserVO vo =  service.getUserDetails(id);
		return Arrays.asList(vo);
	}
	
	@GetMapping(value= "/getUserDetails")
	public List<UserVO> getUserDetailsFromID(@RequestParam String id) {
		System.out.println("REQUEST PARAMS " + id);
		UserVO vo =  service.getUserDetails(id);
		return Arrays.asList(vo);
	}
	
	@GetMapping(value= "/allUser")
	public Collection<UserVO>  allUser() {
		return service.allUser();
	}
	
	@PostMapping(value= "/addUser")
	public UserVO addUser(@RequestParam String id,
			@RequestParam String name,
			@RequestParam String country) {
		System.out.println("REQUEST PARAMS " + id);
		return service.addUser(id,name,country);
	}
	
	
	
	@PutMapping(value= "/updateUser")
	public UserVO updateUser(@RequestParam String id,
			@RequestParam String name,
			@RequestParam String country) {
		System.out.println("REQUEST PARAMS " + id);
		return service.updateUser(id,name,country);
	}
	
	@DeleteMapping(value= "/deleteUser")
	public Object deleteUser(@RequestParam String id) {
		System.out.println("REQUEST PARAMS " + id);
		return service.deleteUser(id);
	}

}
