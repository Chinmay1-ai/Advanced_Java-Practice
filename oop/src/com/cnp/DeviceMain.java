package com.cnp;

public class DeviceMain {

	public static void main(String[] args) {

		Mobile m = new Mobile();
		Laptop l = new Laptop();

		System.out.println("---- Mobile Object ----");
		m.deviceInfo();
		m.mobileFeature();
		System.out.println("---- Laptop Object ----");
		l.deviceInfo();
		l.laptopFeature();
	}
}
