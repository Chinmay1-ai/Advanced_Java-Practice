package com.miniproject;

public class FoodService {

	public double calculateBill() {
		return 250.0; 
	}

	public void assignDeliveryPartner() {
		DeliveryPartner dp = new DeliveryPartner("Rahul", 9999999999l, "Bike");

		System.out.println("Delivery Partner Assigned:");
		System.out.println("Name: " + dp.getName());
		System.out.println("Vehicle: " + dp.getVehicleType());
	}

	public void placeOrder(Payment payment) {

		double bill = calculateBill();
		System.out.println("Total Bill Amount: ₹" + bill);

		payment.payAmount(bill);

		assignDeliveryPartner();
	}
}