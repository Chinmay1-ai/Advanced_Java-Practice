package com.hospital;

public class Doctor extends Person {

	private int doctorId;
	private String specialization;
	private double fees;

	public Doctor(String name, int age, String gender, int doctorId, String specialization, double fees) {
		super(name, age, gender);
		this.doctorId = doctorId;
		this.specialization = specialization;
		this.fees = fees;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public double getFees() {
		return fees;
	}
}
