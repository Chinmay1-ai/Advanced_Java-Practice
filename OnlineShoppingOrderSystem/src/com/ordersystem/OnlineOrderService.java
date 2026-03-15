package com.ordersystem;

public class OnlineOrderService extends OrderService{

	@Override
	public void placeOrder() {
		 System.out.println("Order placed ONLINE");
	}
}