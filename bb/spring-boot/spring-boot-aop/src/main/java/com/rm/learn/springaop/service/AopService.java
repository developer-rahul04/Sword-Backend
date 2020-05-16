package com.rm.learn.springaop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.learn.springaop.dao.AopDao;

@Service
public class AopService {
	
	@Autowired
	private AopDao aopDao;
	 private static Logger logger = LoggerFactory.getLogger(AopService.class);
	public Boolean authenticateUser(String userId) {
		logger.info("AopService  authenticateUser " );
		return aopDao.authenticateUser(userId);
	}

}
