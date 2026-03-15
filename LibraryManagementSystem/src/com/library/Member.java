package com.library;

public class Member extends Person {

	private int memberId;
	private String membershipType;

	public Member(String name, int age, String gender, int memberId, String membershipType) {
		super(name, age, gender);
		this.memberId = memberId;
		this.membershipType = membershipType;
	}

	public int getMemberId() {
		return memberId;
	}

	public String getMembershipType() {
		return membershipType;
	}
	
	
}
