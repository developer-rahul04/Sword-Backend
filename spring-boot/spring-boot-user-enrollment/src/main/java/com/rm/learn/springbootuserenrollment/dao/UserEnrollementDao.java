package com.rm.learn.springbootuserenrollment.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rm.learn.springbootuserenrollment.vo.UserVO;

@Repository
public class UserEnrollementDao {

	private static Map<String, UserVO> userDetails = new HashMap<>();

	public UserVO getUserDetails(String userId) {
		userDetails.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		System.out.println("userId");
		return userDetails.get(userId);
	}

	public UserVO addUser(String id, String name, String country) {
		userDetails.put(id, new UserVO(id, name, country));
		System.out.println(" user added succesfully " + userDetails.get(id));
		return userDetails.get(id);
	}

	public UserVO updateUser(String id, String name, String country) {

		UserVO userVO = userDetails.get(id);

		if (userVO != null) {

			if (name != null && !name.isEmpty()) {
				userVO.setName(name);
			}

			if (country != null && !country.isEmpty()) {
				userVO.setCountry(country);
			}
			userDetails.put(id, userVO);
		}
		return userVO;
	}

	public Collection<UserVO> allUser() {
		Collection<UserVO> list = userDetails.values();
		return list;
	}

	public Object deleteUser(String id) {
		return userDetails.remove(id);
	}

}
