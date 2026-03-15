package com.static12;

public class Bank {

	String accountHolder;
	static double rateofInterest = 4.5;

	public Bank(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public static void bankROI(double newROI) {

		rateofInterest = newROI + rateofInterest;
		System.out.println("New Rate of Interest is : " + rateofInterest);
	}

	public void checkBalance(double balance) {
		double total = balance + rateofInterest;
		System.out.println("Account Holder is : "+accountHolder);
		System.out.println("Total Balance in Account is : " + total);

	}

	public static void main(String[] args) {
		
		Bank b = new Bank("Chinmay Pawar");
		bankROI(0.45);
		b.checkBalance(50000.252);
	}
}
