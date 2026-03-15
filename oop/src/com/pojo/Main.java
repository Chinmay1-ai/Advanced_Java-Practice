package com.pojo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the ID of Patient : ");
		int pId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Name of Patient : ");
		String pName = sc.nextLine();

		System.out.println("Enter the Age of Patient : ");
		int pAge = sc.nextInt();

		Patient p = new Patient(pId, pName, pAge);

		System.out.println("---------------------------------------------");

		System.out.println("Enter the ID of Docotr : ");
		int dId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Name of Doctor : ");
		String dName = sc.nextLine();

		System.out.println("Enter the Specialization of Doctor : ");
		String dSpecialization = sc.nextLine();
		
		Doctor d = new Doctor(dId, dName, dSpecialization);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Enter the Room Number for Patient");
		int rNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Type of Room (Premium / Ordinary )");
		String rType = sc.nextLine();
		
		Room r = new Room(rNo, rType);
		
		System.out.println("------------------------------------------------");
	}
}
