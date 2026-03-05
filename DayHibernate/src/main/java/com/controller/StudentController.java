package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		System.out.println("..................CRUD Operation Machine................");
		System.out.println("1 Insert");
		System.out.println("2 Delete");
		System.out.println("3 Update");
		System.out.println("4 Get Particular Record");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			Student s = new Student();

			sc.nextLine();

			System.out.println("Enter Name:");
			s.setName(sc.nextLine());

			System.out.println("Enter City:");
			s.setCity(sc.nextLine());

			System.out.println("Enter Age:");
			s.setAge(sc.nextInt());

			service.insertData(s);

			break;

		case 2:

			System.out.println("Enter Id to delete:");
			int id = sc.nextInt();

			service.deleteData(id);

			break;

		case 3:

			Student s2 = new Student();

			System.out.println("Enter Id to update:");
			s2.setStud_id(sc.nextInt());

			sc.nextLine();

			System.out.println("Enter new Name:");
			s2.setName(sc.nextLine());

			System.out.println("Enter new City:");
			s2.setCity(sc.nextLine());

			System.out.println("Enter new Age:");
			s2.setAge(sc.nextInt());

			service.updateData(s2);

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