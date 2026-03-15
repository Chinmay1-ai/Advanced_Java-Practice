package com.sct;

public class Q8 {
	public static void main(String[] args) {
		String vehicle = "Car";

		switch (vehicle) {

		case "Bike":
			System.out.println("The toll Bike has to Pay is 120");
			break;
		case "Car":
			System.out.println("The toll Car has to Pay is 150");
			break;
		case "Bus":
			System.out.println("The toll Bus has to Pay is 200");
			break;
		case "Truck":
			System.out.println("The toll Truck has to Pay is 250");
			break;
		default:
			System.out.println("Invalid Vehicle Type");
			break;
		}
	}
}
