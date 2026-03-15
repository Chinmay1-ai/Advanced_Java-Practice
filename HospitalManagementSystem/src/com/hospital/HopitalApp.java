package com.hospital;

import java.util.Scanner;

public class HopitalApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of Doctor : ");
		String dName = sc.nextLine();

		System.out.println("Enter the Age of  Doctor : ");
		int dAge = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Gender of Doctor : ");
		String dGender = sc.nextLine();

		System.out.println("Enter the ID of Doctor : ");
		int dId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Specialization of Doctor : ");
		String dSpec = sc.nextLine();

		System.out.println("Enter the Fees : ");
		double dFees = sc.nextDouble();

		Doctor d = new Doctor(dName, dAge, dGender, dId, dSpec, dFees);
		
		/* -------------------------------------------------*/

		sc.nextLine();
		System.out.println("Enter the Name of Patient : ");
		String pName = sc.nextLine();

		System.out.println("Enter the Age of Patient : ");
		int pAge = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Gender of Patient : ");
		String pGender = sc.nextLine();

		System.out.println("Enter ID of Patient : ");
		int pId = sc.nextInt();

		System.out.println("Is Patient Currently Admitted ? (true / false) : ");
		boolean admitted = sc.nextBoolean();

		Patient p = new Patient(pName, pAge, dGender, pId, pGender, admitted);

		HospitalService service = new HospitalService();

		service.showDoctorDetails(d);
		service.showPatientDetails(p);
		service.checkAdmission(p);

		sc.close();

	}
}
