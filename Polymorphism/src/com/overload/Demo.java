package com.overload;

public class Demo {

	public void myShow(int age, String name) {
		System.out.println("Welcome : " + name);
		System.out.println("Your age is  : " + age);
		System.out.println("---------------------------");
	}

	public void myShow(String name, int age) {
		System.out.println("Welcome : " + name);
		System.out.println("Your age is  : " + age);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {

		Demo d = new Demo();

		d.myShow(22, "Chinmay Pawar");
		d.myShow("Shravan", 20);
	}
}
