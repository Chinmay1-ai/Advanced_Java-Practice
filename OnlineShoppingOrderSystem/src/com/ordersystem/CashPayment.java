package com.ordersystem;

public class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of ₹" + amount + " done using CASH");
	}

}
