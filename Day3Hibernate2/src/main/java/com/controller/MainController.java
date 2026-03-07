package com.controller;

import java.util.Scanner;

import com.service.PersonsService;

public class MainController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonsService service = new PersonsService();

		System.out.println("..................CRUD Operation Machine................");
		System.out.println("1 Insert");
		System.out.println("2 Delete");
		System.out.println("3 Update");
		System.out.println("4 Get All Record");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			service.insertData();
			break;

		case 2:

			service.deleteData();
			break;

		case 3:

			service.updateData();
			break;

		case 4:

			service.getAllRecord();
			break;

		default:
			System.out.println("Invalid Input....");
		}

		sc.close();
	}
}