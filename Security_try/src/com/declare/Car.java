package com.declare;

public class Car {

	String modelName;
	int price;

	public Car() {
		System.err.println("Car Has Started !!!!!!");
		System.err.println("----------------------------------");
	}

	public Car(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
		this.CarInfo();
	}
	public Car(int price) {
		this.price = price;
		this.CarInfo();
	}

	public void CarInfo() {
		System.out.print("The Car Model is ");
		System.out.println(modelName);
		System.out.print("The Car Price is ");
		System.out.println(price);
		System.out.println("-----------------------------------");

	}
}
