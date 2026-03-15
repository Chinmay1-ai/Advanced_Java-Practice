package com.reff;

public class AmazonPay extends Payment {
	@Override
	public void myBalance() {
		System.out.println("Available Balance : 50,000");
	}

	@Override
	public void myReward() {
		System.out.println("You will get 11Rs Cashback on AmazonPay........");
	}

}
