package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

    @Id
    private int personId;
    private String name;
    private int age;
    private String gender;
    private String city;
    private String country;
    private long phoneNumber;
    private String email;

    @OneToOne
    @JoinColumn(name="passport_id")
    private Passport passport;

	public Person() {
		
	}

	public Person(int personId, String name, int age, String gender, String city, String country, long phoneNumber,
			String email, Passport passport) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passport = passport;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city="
				+ city + ", country=" + country + ", phoneNumber=" + phoneNumber + ", email=" + email + ", passport="
				+ passport + "]";
	}
	
	

	
}