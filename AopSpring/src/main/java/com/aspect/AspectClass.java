package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

	@Before("execution(* com.tka.BankApp.*(..))")
	public void logBefore() {
		System.out.println("Transaction started...");
	}

	@After("execution(* com.tka.BankApp.*(..))")
	public void logAfter() {
		System.out.println("Transaction completed...");
	}

//	@Around("execution(* com.tka.BankApp.*(..))")
//	public void aroundMain(ProceedingJoinPoint p) {
//
//		System.out.println("Transaction started...");
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("Transaction completed...");
//	}
}
