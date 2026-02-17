package com.pojo;

import java.sql.Date;

public class DoctorPojo {

	private int doctor_id;
	private String name;
	private String email;
	private String phone;
	private String specialization;
	private int experience;
	private String gender;
	private double salary;
	private Date joining_date;
	private String status;
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DoctorPojo(int doctor_id, String name, String email, String phone, String specialization, int experience,
			String gender, double salary, Date joining_date, String status) {
		this.doctor_id = doctor_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.specialization = specialization;
		this.experience = experience;
		this.gender = gender;
		this.salary = salary;
		this.joining_date = joining_date;
		this.status = status;
	}
	public DoctorPojo() {
		
	}
	@Override
	public String toString() {
		return "DoctorPojo [doctor_id=" + doctor_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", specialization=" + specialization + ", experience=" + experience + ", gender=" + gender
				+ ", salary=" + salary + ", joining_date=" + joining_date + ", status=" + status + "]";
	}
	
	
	
}
