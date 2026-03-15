package com.orderdetail;

public class FoodApp {

	public static void main(String[] args) {

		Payment payment;

		double amount = 1500;

		payment = new UpiPayment();
		System.out.println("Final amount on UPI is " + payment.pay(amount));

		System.out.println("+----------------------------------------------------------+");
		payment = new CardPayment();
		System.out.println("Final amount on Card is " + payment.pay(amount));
	}
}
