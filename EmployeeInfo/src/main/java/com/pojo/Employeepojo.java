package com.pojo;

public class Employeepojo {

	private int emp_id;
	private String name;
	private String email;
	private int age;
	private String city;
	private String gender;
	private long salary;
	private String joining_date;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public Employeepojo(int emp_id, String name, String email, int age, String city, String gender, long salary,
			String joining_date) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.salary = salary;
		this.joining_date = joining_date;
	}
	public Employeepojo() {
		
	}
	
	@Override
	public String toString() {
		return "Employeepojo [emp_id=" + emp_id + ", name=" + name + ", email=" + email + ", age=" + age + ", city="
				+ city + ", gender=" + gender + ", salary=" + salary + ", joining_date=" + joining_date + "]";
	}
}
