package com.overriding;

public class Bike extends Vehicle {

	@Override
	public void Mileage() {
		System.out.println("The Mileage of Bike is 40");
	}

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Car c = new Car();
		Bike b = new Bike();

		v.Mileage();
		c.Mileage();
		b.Mileage();
	}
}
