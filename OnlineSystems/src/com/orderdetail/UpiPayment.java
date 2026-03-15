package com.orderdetail;

public class UpiPayment implements Payment {

	@Override
	public double pay(double amount) {
		if (amount > 500) {
			amount = amount - (amount * 0.05);

		}
		return amount;
	}
}
