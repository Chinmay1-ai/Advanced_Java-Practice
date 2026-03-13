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
}


