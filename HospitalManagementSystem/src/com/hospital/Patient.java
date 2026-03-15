package com.hospital;

public class Patient extends Person {
	private int patientId;
	private String admittedDate;
	private boolean isAdmitted;

	public Patient(String name, int age, String gender, int patientId, String admittedDate, boolean isAdmitted) {
		super(name, age, gender);
		this.patientId = patientId;
		this.admittedDate = admittedDate;
		this.isAdmitted = isAdmitted;
	}

	public int getPatientId() {
		return patientId;
	}

	public String getAdmittedDate() {
		return admittedDate;
	}

	public boolean isAdmitted() {
		return isAdmitted;
	}
}
