package com.reff;

public class GPay extends Payment{

	@Override
	public void myBalance() {
		System.out.println("Available Balance : 50,000");
	}
	@Override
	public void myReward() {
		System.out.println("You will get 10Rs Cashback on GooglePay........");
	}
}
