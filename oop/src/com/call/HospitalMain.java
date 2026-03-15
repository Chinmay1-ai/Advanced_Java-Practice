package com.call;

import com.oop.Hospital;

public class HospitalMain {
	public static void main(String[] args) {

		Hospital h = new Hospital();

		h.hospitalName = "Apollo Hospital";
		h.doctorName = "Dr. Mehta";
		h.doctorAge = 45;
		h.specialization = "Cardiologist";
		h.patientName = "Amit Sharma";
		h.patientAge = 32;
		h.disease = "Heart Issue";
		h.fees = 1200.50;
		h.isAdmitted = true;
		h.city = "Mumbai";

		System.out.println("----- Hospital Details -----");
		System.out.println("Hospital: " + h.hospitalName);
		System.out.println("Doctor: " + h.doctorName);
		System.out.println("Doctor Age: " + h.doctorAge);
		System.out.println("Specialization: " + h.specialization);
		System.out.println("Patient: " + h.patientName);
		System.out.println("Patient Age: " + h.patientAge);
		System.out.println("Disease: " + h.disease);
		System.out.println("Fees: " + h.fees);
		System.out.println("Admitted: " + h.isAdmitted);
		System.out.println("City: " + h.city);
	}
}
