package com.call;

import com.declare.Flipkart;

public class FlipkartInfo {

	public static void main(String[] args) {

		Flipkart f1 = new Flipkart();

		f1.setProductName("Ear Buds");
		f1.setPrice(299);
		f1.setRating(4);
		f1.setDiscount(49);
		f1.setSellerName("Naresh Mhaske");

		System.err.println("Product Details !!!!!");
		System.out.println("The Name of Product is " + f1.getProductName());
		System.out.println("The Price of Product is " + f1.getPrice() + "$");
		System.out.println("The Rating of Product is " + f1.getRating() + "*");
		System.out.println("The Discount on Product is " + f1.getDiscount() + "%");
		System.out.println("The Name of Seller is " + f1.getSellerName());

	}
}
