package com.pojo;

public class Hospital {

	Patient patient;
	Doctor d;
	Room r;
	
	public Hospital() {
		
	}

	public Hospital(Patient patient, Doctor d, Room r) {
		super();
		this.patient = patient;
		this.d = d;
		this.r = r;
	}

	public Patient getP() {
		return patient;
	}

	public void setP(Patient patient) {
		this.patient = patient;
	}

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	public Room getR() {
		return r;
	}

	public void setR(Room r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Hospital [patient=" + patient + ", d=" + d + ", r=" + r + "]";
	}
	
	
}
