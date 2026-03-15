package com.management;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of Student : ");
		String sName = sc.nextLine();

		System.out.println("Enter the Address of Student : ");
		String sAddress = sc.nextLine();

		System.out.println("Enter the Roll No. of Student : ");
		int sRoll = sc.nextInt();

		System.out.println("Enter the Marks of Student : ");
		float sMakrs = sc.nextFloat();

		SchlolarshipStudent s = new SchlolarshipStudent(sName, sAddress, sRoll, sMakrs);
		s.eligibility(s);
		
	}
}
