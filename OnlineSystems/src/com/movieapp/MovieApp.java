package com.movieapp;

import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of Customer");
		String name = sc.nextLine();

		System.out.println("Enter Your Mobile Number");
		long mob = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Email of Customer");
		String mail = sc.nextLine();

		Customer c = new Customer(name, mob, mail);

		System.out.println("Choose Your Prefference");
		System.out.println(" 1. Online Ticket Booking");
		System.out.println(" 2. Offline Ticket Booking");
		int bookingChoice = sc.nextInt();

		MovieService movie;

		if (bookingChoice == 1) {
			movie = new OnlineService();
		} else if (bookingChoice == 2) {
			movie = new OfflineService();
		} else {
			System.out.println("Invalid Choice");
			sc.close();
			return;
		}

		movie.selectMovie();

		System.out.println("Enter the Number of Seats");
		int seat = sc.nextInt();

		double bill = movie.calculateTicketPrice(seat);
		System.out.println("Total Bill : " + bill);

		System.out.println("Choose Your Payment Method");
		System.out.println(" 1. UPI");
		System.out.println(" 2. CARD");
		int choice = sc.nextInt();

		Payment p;

		if (choice == 1) {
			p = new UpiPayment();

		} else {
			p = new CardPayment();
		}

		movie.bookTicket(p, bill);

		sc.close();
	}
}
