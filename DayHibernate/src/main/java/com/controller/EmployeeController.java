package com.controller;

import java.util.Scanner;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();

		System.out.println("..................CRUD Operation Machine................");
		System.out.println("1 Insert");
		System.out.println("2 Delete");
		System.out.println("3 Update");
		System.out.println("4 Get Particular Record");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			Employee e = new Employee();


			sc.nextLine();
			
			System.out.println("Enter Name:");
			e.setName(sc.nextLine());

			System.out.println("Enter City:");
			e.setCity(sc.nextLine());

			System.out.println("Enter Age:");
			e.setAge(sc.nextInt());

			service.insertData(e);

			break;

		case 2:

			System.out.println("Enter Id to delete:");
			int id = sc.nextInt();

			service.deleteData(id);

			break;

		case 3:

			Employee e2 = new Employee();

			System.out.println("Enter Id to update:");
			e2.setEmpId(sc.nextInt());

			sc.nextLine();

			System.out.println("Enter new Name:");
			e2.setName(sc.nextLine());

			System.out.println("Enter new City:");
			e2.setCity(sc.nextLine());

			System.out.println("Enter new Age:");
			e2.setAge(sc.nextInt());

			service.updateData(e2);

			break;
			
		case 4:

			System.out.println("Enter Id to Fetch:");
			int id1 = sc.nextInt();

			service.getSingleRecord(id1);

			break;

		default:
			System.out.println("Invalid Input....");
		}

		sc.close();
	}
}