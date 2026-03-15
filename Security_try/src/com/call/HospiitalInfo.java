package com.call;

import com.declare.Hospital;

public class HospiitalInfo {

	public static void main(String[] args) {

		Hospital h1 = new Hospital();

		h1.setPatientID(145);
		h1.setPatientName("Rahul Gandhi");
		h1.setDisease("Mental Disorder");
		h1.setAge(50);
		h1.setDoctorAssigned("Dr. Narendra Modi");
		h1.setBillAmount(1000000);

		System.err.println("Patient Details !!!!!!");
		System.out.println("The ID of Patient is " + h1.getPatientID());
		System.out.println("The Name of Patient is " + h1.getPatientName());
		System.out.println("The Disease Patient has is " + h1.getDisease());
		System.out.println("The Age of Patient is " + h1.getAge());
		System.out.println("The Doctor Assigned for Patient is " + h1.getDoctorAssigned());
		System.out.println("The Total Bill of Patient is " + h1.getBillAmount());

	}
}
