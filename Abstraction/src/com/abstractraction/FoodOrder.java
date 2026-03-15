package com.abstractraction;

public class FoodOrder implements OrderService{

	@Override
	public void placeOrder() {
		System.out.println("Food Order Placed");
	}
	
	@Override
	public void cancelOrder() {
		System.out.println("Food Order Canceled");
	}
}
