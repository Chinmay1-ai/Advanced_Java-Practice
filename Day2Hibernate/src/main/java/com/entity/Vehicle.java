package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private String brand;
	private double price;
	private String fuelType;
	private int modelYear;

	public Vehicle(int vehicleId, String vehicleName, String vehicleType, String brand, double price, String fuelType,int modelYear) {

		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.brand = brand;
		this.price = price;
		this.fuelType = fuelType;
		this.modelYear = modelYear;
	}

	public Vehicle() {
		
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", brand=" + brand + ", price=" + price + ", fuelType=" + fuelType + ", modelYear=" + modelYear + "]";
	}

}