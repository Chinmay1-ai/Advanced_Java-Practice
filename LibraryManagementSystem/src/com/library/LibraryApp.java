package com.library;

import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of Librarian");
		String lName = sc.nextLine();

		System.out.println("Enter the Age of Librarian");
		int lAge = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Gender of Librarian");
		String lGender = sc.nextLine();

		System.out.println("Enter the ID of Librarian");
		int lId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Shift of Librarian");
		String lShift = sc.nextLine();

		Librarian l = new Librarian(lId, lShift, lName, lAge, lGender);

		/* ------------------------------------------------------------------------------- */
		System.out.println("---------------------------------------------------");

		System.out.println("Enter the Name of Member");
		String mName = sc.nextLine();

		System.out.println("Enter the Age of Member");
		int mAge = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Gender of Member");
		String mGender = sc.nextLine();

		System.out.println("Enter the ID of Member");
		int mId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Membership Type of Member");
		String mShift = sc.nextLine();

		Member m = new Member(mName, mAge, mGender, mId, mShift);

		/* ---------------------------------------------------------------------------------------- */

		LibraryService library = new LibraryService();

		library.showLibrarianDetail(l);
		library.showMemberDetails(m);

		sc.close();

	}
}
