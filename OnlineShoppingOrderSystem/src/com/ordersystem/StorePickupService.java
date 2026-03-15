package com.ordersystem;

public class StorePickupService extends OrderService {

	@Override
	public void placeOrder() {
		System.out.println("Order placed for STORE PICKUP");
	}
}
