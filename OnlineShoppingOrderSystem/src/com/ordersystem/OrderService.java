package com.ordersystem;

public abstract class OrderService {

	public abstract void placeOrder();

    public double calculateBill(int items) {
        double pricePerItem = 500;
        return items * pricePerItem;
    }

    public void makePayment(Payment p, double amount) {
        p.pay(amount);   // DYNAMIC DISPATCH
        System.out.println("Order Completed Successfully");
    }
}
