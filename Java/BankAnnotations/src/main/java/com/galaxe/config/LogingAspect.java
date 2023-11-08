package com.galaxe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.StringJoiner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Configuration
@EnableAspectJAutoProxy
@Aspect
public class LogingAspect {
	Log logger =LogFactory.getLog(LogingAspect.class);
	@Pointcut("execution(* com.galaxe.service.impl.*.*(..))")
	//@Pointcut("within(com.galaxe.service.impl.*)")//modifier,package name,class  name,method name,
	public void loggingPointCut() {
	
	}
/*	@Before("loggingPointCut()")
	public void logBefore(JoinPoint jp) {
		String method=jp.getSignature().getName();
		String clasz=jp.getTarget().getClass().toString();
		Object[] args=jp.getArgs();
		logger.info(clasz+"."+method+"."+"("+getArgString(args)+")");
	}
	
	@AfterReturning(pointcut="loggingPointCut()",returning= "retVal")
	public Object logAfter(JoinPoint jp,Object retVal) {
		String method=jp.getSignature().getName();
		String clasz=jp.getTarget().getClass().toString();
		Object[] args=jp.getArgs();
		logger.info(clasz+"."+method+"."+"("+getArgString(args)+")"+": Returns :"+retVal.toString());
		return retVal;
	}
	*/
//	@Around("loggingPointCut()")
//	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
//		String method=pjp.getSignature().getName();
//		String clasz=pjp.getTarget().getClass().toString();
//		Object[] args=pjp.getArgs();
//		logger.info(clasz+"."+method+"."+"("+getArgString(args)+")");
//		Object retVal=pjp.proceed();
//		logger.info(clasz+"."+method+"."+"("+getArgString(args)+")"+": Returns :"+retVal.toString());
//		return retVal;
//	}
	@AfterThrowing(pointcut="loggingPointCut()", throwing="ex")
	public void getThrow(Exception ex){
		logger.error(ex);
	}
	

}
