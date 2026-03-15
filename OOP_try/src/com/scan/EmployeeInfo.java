package com.scan;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("......Enter Employee Details here.....");

		System.out.println("Enter the Name of Employee");
		String name = sc.nextLine();

		sc.nextLine();

		System.out.println("Enter the ID of Employee");
		int id = sc.nextInt();

		System.out.println("Enter the salary of Employee");
		long salary = sc.nextLong();

		System.out.println(".....Employee Details.....");
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Salary : " + salary);

	}
}
