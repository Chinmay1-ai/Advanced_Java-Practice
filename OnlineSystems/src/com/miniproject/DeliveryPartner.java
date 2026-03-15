package com.miniproject;

public class DeliveryPartner extends User {

	private String vehicleType;

	public DeliveryPartner(String name, long mobileNo, String vehicleType) {
		super(name, mobileNo);
		this.vehicleType = vehicleType;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
}
