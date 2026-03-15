package com.reff;

public class PhonePe extends Payment {

	@Override
	public void myBalance() {
		System.out.println("Available Balance : 50,000");
	}

	@Override
	public void myReward() {
		System.out.println("You will get 150Rs Cashback on PhonePe........");
	}
}
