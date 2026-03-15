package com.exercise12;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc = new Account(101, "Chinmay", 2000);

        while (true) {

            System.out.println("===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
