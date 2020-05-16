package com.rm.learn.springaop.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.rm.learn.springaop.aop.TimeTrack;

@Repository
public class AopDao {
	 private static Logger logger = LoggerFactory.getLogger(AopDao.class);
	 
	 @TimeTrack
	public Boolean authenticateUser(String userId) {
		logger.info("AopDao  authenticateUser " );
		return (userId != null && userId.length() == 9 && userId.startsWith("1"));
	}

}
