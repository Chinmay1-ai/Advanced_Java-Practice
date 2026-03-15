package com.abstractraction;

public class OrderApp {

	public static void main(String[] args) {
		
		OrderService order;
		
		order = new FoodOrder();
		order.placeOrder();
		order.cancelOrder();
	}
}
