package com.controller;

import java.util.Scanner;

import com.implementation.DoctorServiceImpl;
import com.implementation.PatientServiceImpl;
import com.pojo.PatientPojo;
import com.service.DoctorService;
import com.service.PatientService;

public class PatientController {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		PatientService service = new PatientServiceImpl();
		DoctorService service1 = new DoctorServiceImpl();

		int choice;

		do {
			System.out.println("1. Insert Patient");
			System.out.println("2. Fetch Patient");
			System.out.println("3. Exit");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				PatientPojo d = new PatientPojo();

				System.out.print("Enter Name: ");
				d.setName(sc.nextLine());

				System.out.print("Enter Email: ");
				d.setEmail(sc.nextLine());

				System.out.print("Enter Phone: ");
				d.setPhone(sc.nextLine());

				System.out.print("Enter Age: ");
				d.setAge(sc.nextInt());

				sc.nextLine();

				System.out.print("Enter Gender: ");
				d.setGender(sc.nextLine());

				System.out.print("Enter Disease: ");
				String disease = sc.nextLine();
				d.setDisease(disease);

				int doctorId = service1.getDoctorIdByDisease(disease);

				if (doctorId == -1) {
					System.out.println("No doctor available for this disease!");
					return;
				}

				d.setDoctor_id(doctorId);

				System.out.println("Doctor Assigned Automatically with ID: " + doctorId);

				System.out.print("Enter Admission Date (yyyy-mm-dd): ");
				d.setAdmission_date(sc.nextLine());

				System.out.print("Enter Billing Amount: ");
				d.setBill_amount(sc.nextDouble());
				sc.nextLine();

				service.insertPatient(d);
				break;

			case 2:
				service.fetchPatients();
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
