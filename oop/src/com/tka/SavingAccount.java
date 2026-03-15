package com.tka;

public class SavingAccount extends BankAccount{
	
	double interestRate;
	
	public void ShowSavingInfo() {
		System.out.println("Interest Rate : "+interestRate+"%");
	}
}
