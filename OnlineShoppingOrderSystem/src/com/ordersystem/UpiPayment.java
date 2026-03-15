package com.ordersystem;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of ₹" + amount + " done using UPI");
	}

}
