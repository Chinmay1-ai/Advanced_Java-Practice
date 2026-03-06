package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libraryId;
	private String libraryName;
	private String location;
	private int totalBooks;
	private String librarianName;
	private String contactNumber;
	private int establishedYear;
	
	
	public Library(int libraryId, String libraryName, String location, int totalBooks, String librarianName, String contactNumber, int establishedYear) {
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.location = location;
		this.totalBooks = totalBooks;
		this.librarianName = librarianName;
		this.contactNumber = contactNumber;
		this.establishedYear = establishedYear;
	}

	public Library() {

	}
	
	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", location=" + location
				+ ", totalBooks=" + totalBooks + ", librarianName=" + librarianName + ", contactNumber=" + contactNumber
				+ ", establishedYear=" + establishedYear + "]";
	}

}