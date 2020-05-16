package com.rm.learn.springaop.aop;

import org.aspectj.lang.annotation.Pointcut;

public class AopPointCutConfiguration {

	@Pointcut("execution(* com.rm.learn.springaop.controller.*.*(..))")
	public void getControllerPointCut() {
	};

	//@Pointcut("execution(* com.rm.learn.springaop.service.*.*(..))")
	@Pointcut("within(com.rm.learn.springaop.service..*)")
	public void getServicePointCut() {
	};

	@Pointcut("execution(* com.rm.learn.springaop.dao.*.*(..))")
	//@Pointcut("bean(*Dao*)")
	public void getDaoPointCut() {
	};

	@Pointcut("com.rm.learn.springaop.aop.AopPointCutConfiguration.getDaoPointCut() &&"
			+ "com.rm.learn.springaop.aop.AopPointCutConfiguration.getServicePointCut()")
	public void getAllPointCut() {
	};
	
	@Pointcut("@annotation(com.rm.learn.springaop.aop.TimeTrack)")
	public void getTimeTrack() {
	};
	
    @Pointcut("@target(org.springframework.stereotype.Repository)")
    public void repositoryMethods() {};
 

}
