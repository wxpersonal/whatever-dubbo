package com.wx.whatever.aop;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author weix
 *
 */

@Order(1)
@Aspect
@Component
public class AspectjLog {
	
	private Logger logger = LoggerFactory.getLogger(AspectjLog.class);
	
	//定义通用切点，以便下面4个通知使用
	
	@Pointcut("execution(* com.wx.whatever.service.impl.*ServiceImpl.*(..))")
	public void logAop(){}
	
	@Before("logAop()")
	public void logBefore(){
		logger.debug("前置通知Before-->{}");
	}
	
	@AfterReturning("logAop()")
	public void logAfterReturning(){
		logger.debug("返回通知AfterReturning-->{}");
	}
	
	
	@After("logAop()")
	public void logAfter(){
		logger.debug("后置通知After-->{}");
	}
	
	@AfterThrowing("logAop()")
	public void logAfterThrow(){
		logger.debug("异常通知AfterThrowing-->{}");
	}
	
	/*@Around("logAop()")
	public void logAround(ProceedingJoinPoint jp){
		try {
			logger.debug("自定义前置通知Before-->{}");
			jp.proceed();
			logger.debug("自定义返回通知AfterReturning-->{}");
		} catch (Throwable throwable) {
			logger.debug("异常处理-->{}");
			throwable.printStackTrace();
		}
		logger.debug("自定义后置通知After-->{}");
	}*/
	
	
}
