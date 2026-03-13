package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Person p = context.getBean(Person.class);

		System.out.println(p.getNotification1().notification());
		System.out.println(p.getNotification2().notification());
	}
}
