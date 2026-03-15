package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passport {

	@Id
	private int passportId;
	private String passportNumber;
	private String issueDate;
	private String expiryDate;
	private String nationality;
	private String placeOfIssue;
	private String passportType;

	public Passport() {

	}

	public Passport(int passportId, String passportNumber, String issueDate, String expiryDate, String nationality, String placeOfIssue, String passportType) {
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.nationality = nationality;
		this.placeOfIssue = placeOfIssue;
		this.passportType = passportType;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public String getPassportType() {
		return passportType;
	}

	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", nationality=" + nationality + ", placeOfIssue=" + placeOfIssue
				+ ", passportType=" + passportType + "]";
	}

}