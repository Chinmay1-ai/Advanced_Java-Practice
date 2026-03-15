package com.controller;

import java.util.Scanner;

import com.entity.Library;
import com.service.LibraryService;

public class LibraryController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryService service = new LibraryService();

		System.out.println("..................CRUD Operation Machine................");
		System.out.println("1 Insert");
		System.out.println("2 Delete");
		System.out.println("3 Update");
		System.out.println("4 Get Particular Record");
		System.out.println("5 Get All Record");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			Library l = new Library();

			sc.nextLine();

			System.out.println("Enter Library ID:");
			l.setLibraryId(sc.nextInt());

			sc.nextLine();
			
			System.out.println("Enter Library Name :");
			l.setLibraryName(sc.nextLine());

			System.out.println("Enter Location:");
			l.setLocation(sc.nextLine());
			
			System.out.println("Enter Total Books :");
			l.setTotalBooks(sc.nextInt());
			
			sc.nextLine();
			
			System.out.println("Enter Librarian Name :");
			l.setLibrarianName(sc.nextLine());
			
			System.out.println("Enter Contact Number:");
			l.setContactNumber(sc.nextLine());
			
			System.out.println("Enter Established Year:");
			l.setEstablishedYear(sc.nextInt());

			service.insertData(l);

			break;

		case 2:

			System.out.println("Enter Id to delete:");
			int id = sc.nextInt();

			service.deleteData(id);

			break;

		case 3:

			Library l2 = new Library();

			System.out.println("Enter Id to update:");
			l2.setLibraryId(sc.nextInt());

			sc.nextLine();

			System.out.println("Enter new Librarian Name:");
			l2.setLibraryName(sc.nextLine());

			System.out.println("Enter new Location:");
			l2.setLocation(sc.nextLine());

			System.out.println("Enter Total books :");
			l2.setTotalBooks(sc.nextInt());

			service.updateData(l2);

			break;

		case 4:

			System.out.println("Enter Id to Fetch:");
			int id1 = sc.nextInt();

			service.getSingleRecord(id1);

			break;
			
		case 5:
			
			service.getAllRecord();
			
			break;

		default:
			System.out.println("Invalid Input....");
		}

		sc.close();
	}
}