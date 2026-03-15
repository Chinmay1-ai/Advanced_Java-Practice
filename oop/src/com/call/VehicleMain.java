package com.call;

import com.oop.Vehicle;

public class VehicleMain {
	public static void main(String[] args) {

		Vehicle v = new Vehicle();

		String carName = v.name = "Fortuner";
		String carType = v.type = "SUV";
		int carModelYear = v.modelYear = 2024;
		String carFuel = v.fuelType = "Diesel";
		int carPrice = v.price = 4200000;
		String carCompany = v.company = "Toyota";
		int carMileage = v.mileage = 12;
		String carColor = v.color = "White";
		int topSpeed = v.topSpeed = 180;
		boolean isElectric = v.isElectric = false;

		System.err.println("----- Vehicle Details -----");
		System.out.println("Name: " + carName);
		System.out.println("Type: " + carType);
		System.out.println("Model Year: " + carModelYear);
		System.out.println("Fuel Type: " + carFuel);
		System.out.println("Price: " + carPrice);
		System.out.println("Company: " + carCompany);
		System.out.println("Mileage: " + carMileage);
		System.out.println("Color: " + carColor);
		System.out.println("Top Speed: " + topSpeed);
		System.out.println("Is Electric: " + isElectric);
	}
}
