package com.call;

import com.oop.Bank;

public class BankMain {
public static void main(String[] args) {
	 Bank bank = new Bank();

     bank.bankName = "State Bank of India";
     bank.branch = "Pune";
     bank.accountNumber = 987654321123L;
     bank.accountHolder = "Rohit Sharma";
     bank.balance = 45890.55;
     bank.ifsc = "SBI000129";
     bank.accountType = "Savings";
     bank.isActive = true;
     bank.city = "Pune";
     bank.mobile = 9876543210L;

     System.err.println("----- Bank Details -----");
     System.out.println("Bank: " + bank.bankName);
     System.out.println("Branch: " + bank.branch);
     System.out.println("Account Number: " + bank.accountNumber);
     System.out.println("Account Holder: " + bank.accountHolder);
     System.out.println("Balance: " + bank.balance);
     System.out.println("IFSC: " + bank.ifsc);
     System.out.println("Account Type: " + bank.accountType);
     System.out.println("Active: " + bank.isActive);
     System.out.println("City: " + bank.city);
     System.out.println("Mobile: " + bank.mobile);
}
}
