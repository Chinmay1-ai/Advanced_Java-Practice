package com.ecm;

public class Mobile {

	private String model;
	private int price;
	private String spec;
	
	Mobile(String model , int price){
		this.model = model;
		this.price = price;
	}

	
	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}


	public String getModel() {
		return model;
	}


	public int getPrice() {
		return price;
	}
	
	public void Discount() {
		int disAmount = (price * 10) / 100;
		int finalPrice = price - disAmount;
		
		System.out.println("The Final Price after Discount  is "+finalPrice);
	}
	
}
