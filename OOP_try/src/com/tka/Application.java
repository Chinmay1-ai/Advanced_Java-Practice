package com.tka;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PersonalInfo p = new PersonalInfo();

		while (true) {
			System.out.println(".......What do you Want to Enter.......");
			System.out.println("1. Name");
			System.out.println("2. Age");
			System.out.println("3. Salary");
			System.out.println("4. Exit");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter Name ");
				String myName = sc.nextLine();
				p.setName(myName);
				
			} else if (choice == 2) {
				System.out.println("Enter Age ");
				int myAge = sc.nextInt();
				p.setAge(myAge);
			} else if (choice == 3) {
				System.out.println("Enter thee Salary ");
				double mySalary = sc.nextDouble();
				p.setSalary(mySalary);
			} else if (choice == 4) {
				System.out.println("Thank you for Visiting.........");
				break;
			} else {
				System.out.println("........Invalid Choice......");
			}
		}

		System.out.println("...Personal Details...");
		p.showDetail();
		sc.close();

	}
}
