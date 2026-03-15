package com.declare;

public class Hospital {

	private int patientID;
	private String patientName;
	private String disease;
	private int age;
	private String doctorAssigned;
	private int billAmount;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctorAssigned() {
		return doctorAssigned;
	}

	public void setDoctorAssigned(String doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

}
