package com.miniproject;

public class CashPayment implements Payment {

	@Override
	public void payAmount(double amount) {
		System.out.println("Payment of ₹" + amount + " will be collected in CASH");
	}
}
