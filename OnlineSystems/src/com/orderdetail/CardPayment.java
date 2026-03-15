package com.orderdetail;

public class CardPayment implements Payment {

	@Override
	public double pay(double amount) {
		amount = amount + 50;
		return amount;
	}
}
