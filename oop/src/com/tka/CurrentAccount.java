package com.tka;

public class CurrentAccount extends BankAccount{

	double overdraftLimit;
	
	public void ShowCurrentinfo() {
		System.out.println("Overdraft Limit : "+overdraftLimit);
	}
}
