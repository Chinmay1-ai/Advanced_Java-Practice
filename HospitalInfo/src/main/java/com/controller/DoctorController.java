package com.controller;

import java.util.Scanner;

import com.implementation.DoctorServiceImpl;
import com.pojo.DoctorPojo;
import com.service.DoctorService;

public class DoctorController {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		DoctorService service = new DoctorServiceImpl();

		int choice;

		do {
			System.out.println("1. Insert Doctor");
			System.out.println("2. Fetch Doctors");
			System.out.println("3. Exit");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				DoctorPojo d = new DoctorPojo();

				System.out.print("Enter Name: ");
				d.setName(sc.nextLine());

				System.out.print("Enter Email: ");
				d.setEmail(sc.nextLine());

				System.out.print("Enter Phone: ");
				d.setPhone(sc.nextLine());

				System.out.print("Enter Specialization: ");
				d.setSpecialization(sc.nextLine());

				System.out.print("Enter Experience: ");
				d.setExperience(sc.nextInt());

				sc.nextLine();

				System.out.print("Enter Gender: ");
				d.setGender(sc.nextLine());

				System.out.print("Enter Salary: ");
				d.setSalary(sc.nextDouble());

				sc.nextLine();

				System.out.print("Enter Joining Date (yyyy-mm-dd): ");
				d.setJoining_date(sc.nextLine());

				d.setStatus("Active");
				
				service.insertDoctor(d);
				break;

			case 2:
				service.fetchAllDoctors();
				break;

			case 3:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 3);
		sc.close();
	}
}
