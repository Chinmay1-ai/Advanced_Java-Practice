package com.ecm;

public class BankManager {

	public static void main(String[] args) {

		BankAccount b = new BankAccount(80000);

		b.Withdraw(10000, "Joe Biden");
		b.Deposit("Donalad Trumph", 45856552, 20000);
		b.GetBalance("Virat Sharma", 45265354);
	}
}
