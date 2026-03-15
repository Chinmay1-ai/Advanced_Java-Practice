package com.abstractraction;

public class User {

	public static void main(String[] args) {

		UPI u;

		u = new GPay();
		u.makePayment();
		System.out.println("---------------------------");
		u = new Paytm();
		u.makePayment();
		System.out.println("---------------------------");
		u = new PhonePe();
		u.makePayment();
	}
}
