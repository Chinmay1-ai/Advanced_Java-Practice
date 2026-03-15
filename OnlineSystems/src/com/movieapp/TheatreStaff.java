package com.movieapp;

public class TheatreStaff extends Person {

	private int staffId;

	public TheatreStaff(String name, long mobile, int staffId) {
		super(name, mobile);
		this.staffId = staffId;
	}

	public int getStaffId() {
		return staffId;
	}
}
