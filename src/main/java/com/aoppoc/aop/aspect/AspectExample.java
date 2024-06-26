package com.aoppoc.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectExample {
	
	@Before("execution(* com.aoppoc.aop.services.PaymentServiceImpl.payment(..))")
	public void beforepayment() {
		System.out.println("Payment Started......");
		
	}
	@After("execution(* com.aoppoc.aop.services.PaymentServiceImpl.payment(..))")
	public void afterpayment() {
		System.out.println("Payment Successfully......");
	
	}

}
