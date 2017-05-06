package com.wx.whatever.aop;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class AspectjLog {

	//定义通用切点，以便下面4个通知使用
	
	@Pointcut("execution(* com.wx.whatever.service.impl.*ServiceImpl.*(..))")
	public void logAop(){}
	
	@Before("logAop()")
	public void logBefore(){
		log.debug("前置通知Before-->{}");
	}
	
	@AfterReturning("logAop()")
	public void logAfterReturning(){
		log.debug("返回通知AfterReturning-->{}");
	}
	
	
	@After("logAop()")
	public void logAfter(){
		log.debug("后置通知After-->{}");
	}
	
	@AfterThrowing("logAop()")
	public void logAfterThrow(){
		log.debug("异常通知AfterThrowing-->{}");
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
