package com.rm.learn.springbootuserenrollment.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.learn.springbootuserenrollment.dao.UserEnrollementDao;
import com.rm.learn.springbootuserenrollment.vo.UserVO;

@Service
public class UserEnrollementService {
	
	@Autowired
	private UserEnrollementDao dao;

	public UserVO getUserDetails(String userId) {
		return dao.getUserDetails(userId);
	}

	public UserVO addUser(String id, String name, String country) {
		 return dao.addUser(id,name,country);
	}

	public UserVO updateUser(String id, String name, String country) {
		 return dao.updateUser(id,name,country);
	}

	public Collection<UserVO>  allUser() {
		return dao.allUser();
	}

	public Object deleteUser(String id) {
		return dao.deleteUser(id);
	}

}
