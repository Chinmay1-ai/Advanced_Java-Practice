package com.pojo;

public class PatientPojo {

    private int patient_id;
    private String name;
    private String email;
    private String phone;
    private int age;
    private String gender;
    private String disease;
    private String admission_date;
    private int doctor_id;
    private double bill_amount;
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getAdmission_date() {
		return admission_date;
	}
	public void setAdmission_date(String admission_date) {
		this.admission_date = admission_date;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public double getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}
	public PatientPojo(int patient_id, String name, String email, String phone, int age, String gender, String disease,
			String admission_date, int doctor_id, double bill_amount) {
		this.patient_id = patient_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
		this.admission_date = admission_date;
		this.doctor_id = doctor_id;
		this.bill_amount = bill_amount;
	}
	
	public PatientPojo() {
		
	}
	@Override
	public String toString() {
		return "PatientPojo [patient_id=" + patient_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", age=" + age + ", gender=" + gender + ", disease=" + disease + ", admission_date=" + admission_date
				+ ", doctor_id=" + doctor_id + ", bill_amount=" + bill_amount + "]";
	}
    
}
