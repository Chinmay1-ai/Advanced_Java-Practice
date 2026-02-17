package com.controller;

import java.util.Scanner;
import com.pojo.Employeepojo;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) throws Exception {

		Employeepojo p1 = new Employeepojo();
		Scanner sc = new Scanner(System.in);
		EmployeeService ss = new EmployeeService();
		int choice;

		do {
			System.out.println("1. Insert Data");
			System.out.println("2. Update Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Fetch Particular Record");
			System.out.println("5. Fetch All Record");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter your Information");
				sc.nextLine();
				System.out.println("Enter your Name");
				p1.setName(sc.nextLine());
				System.out.println("Enter your Email");
				p1.setEmail(sc.nextLine());
				System.out.println("Enter your City");
				p1.setCity(sc.nextLine());
				System.out.println("Enter your Age");
				p1.setAge(sc.nextInt());
				ss.insertData(p1);
				break;

			case 2:
				System.out.println("Enter your Information");
				System.out.println("Enter your Gender");
				p1.setGender(sc.nextLine());
				System.out.println("Enter your Salary");
				p1.setSalary(sc.nextLong());
				sc.nextLine();
				System.out.println("Enter your ID");
				p1.setEmp_id(sc.nextInt());
				ss.updateData(p1);
				break;

			case 3:
				System.out.println("Enter your Information");
				System.out.println("Enter your ID");
				p1.setEmp_id(sc.nextInt());
				ss.deleteData(p1);
				break;

			case 4:
				System.out.println("Enter your Information");
				System.out.println("Enter your ID");
				int id = sc.nextInt();
//				p1.setEmp_id(sc.nextInt());
				
				ss.fetchParticularRecord(p1,id);
				break;

			case 5:
				ss.fetchAllData();
				break;

			case 6:
				System.out.println("Exiting Program...");
				break;

			default:
				System.out.println("Invalid Choice! Try Again.");
			}

		} while (choice != 6);

		sc.close();
	}
}
