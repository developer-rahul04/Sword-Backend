package com.rm.learn.springaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopContextCheck {
	private static Logger logger = LoggerFactory.getLogger(AopContextCheck.class);

	// What kind of method calls I would intercept
	// execution(* PACKAGE.*.*(..))
	// Weaving & Weaver
	@Before("com.rm.learn.springaop.aop.AopPointCutConfiguration.getControllerPointCut()")
	public void before(JoinPoint joinPoint) throws Exception {
		// Advice
		logger.info(" before {} " , joinPoint);
		String inputArgs = (String) joinPoint.getArgs()[0];
		logger.info(" inputArgs {}", inputArgs);
		if (inputArgs == null || inputArgs.length() != 9 || !inputArgs.startsWith("1")) {
			logger.info(" Exception ");
			throw new Exception(" USER ID INVALID ");
		}
	}

	@After("com.rm.learn.springaop.aop.AopPointCutConfiguration.getServicePointCut()")
	public void after(JoinPoint joinPoint) throws Exception {
		// Advice
		logger.info(" after {} " , joinPoint);
	}

	@Around("com.rm.learn.springaop.aop.AopPointCutConfiguration.getDaoPointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		// Advice
		logger.info(" around {} " , joinPoint);
		long value = System.currentTimeMillis();
		logger.info(" value {} " , value);
		joinPoint.proceed();
		logger.info(" maxTime {} " , (System.currentTimeMillis() - value));
	}

	@AfterReturning(value = "com.rm.learn.springaop.aop.AopPointCutConfiguration.getControllerPointCut()",
			returning = "obj")
	public void afterReturning(JoinPoint joinPoint,Boolean obj) throws Exception {
		logger.info(" afterReturning {} " , joinPoint);
		logger.info(" obj {} " , obj);
		// Advice
	}

	@AfterThrowing(value = "com.rm.learn.springaop.aop.AopPointCutConfiguration.getAllPointCut()",
			throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex) throws Exception {
		logger.info(" afterThrowing {} " , joinPoint);
		logger.info(" Exception {} " , ex);
	}
	
	@After("com.rm.learn.springaop.aop.AopPointCutConfiguration.getTimeTrack()")
	public void aroundTimeTrack(JoinPoint joinPoint) throws Throwable {
		// Advice
		logger.info(" aroundTimeTrack {} " , joinPoint);
		long value = System.currentTimeMillis();
		logger.info(" aroundTimeTrack value {} " , value);
		logger.info(" aroundTimeTrack maxTime {} " , (System.currentTimeMillis() - value));
	}

}
