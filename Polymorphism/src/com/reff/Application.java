package com.reff;

public class Application {

	public static void main(String[] args) {

		Payment p;

		p = new GPay();
		p.myReward();
		p.myBalance();
		System.out.println("----------------------------------------------");
		
		p = new PhonePe();
		p.myReward();
		p.myBalance();
		System.out.println("----------------------------------------------");
		
		p = new Paytm();
		p.myReward();
		p.myBalance();
		System.out.println("----------------------------------------------");
		
		p = new AmazonPay();
		p.myReward();
		p.myBalance();
	}
}
