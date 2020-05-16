package com.rm.learn.springbootwebmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rm.learn.springbootuserenrollment.vo.UserVO;
import com.rm.learn.springbootwebmvc.service.UserEnrollementService;

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
	public ModelAndView  allUser() {
		ModelAndView  modelView = new ModelAndView("userDetails");
		List<UserVO> userVo = (List<UserVO>) service.allUser();
		modelView.addObject("addAllUser",userVo);
		return modelView;
	}
	
	@PostMapping(value= "/addUser")
	public ModelAndView  addUser(@RequestParam String id,
			@RequestParam String name,
			@RequestParam String country) {
		System.out.println("addUser " + id);
		ModelAndView  modelView = new ModelAndView("userDetails");
		modelView.addObject("addedUser",service.addUser(id,name,country));
		return modelView;
	}
	
	@PostMapping(value= "/updateUser")
	public ModelAndView updateUser(@RequestParam String id,
			@RequestParam String name,
			@RequestParam String country) {
		System.out.println("updateUser " + id);
		ModelAndView  modelView = new ModelAndView("userDetails");
		modelView.addObject("updatedUser",service.updateUser(id,name,country));
		return modelView;
	}
	
	@PostMapping(value= "/deleteUser")
	public ModelAndView deleteUser(@RequestParam String id) {
		System.out.println("deleteUser " + id);
		ModelAndView  modelView = new ModelAndView("userDetails");
		modelView.addObject("deletedUser",service.deleteUser(id));
		return modelView;
	}
}
