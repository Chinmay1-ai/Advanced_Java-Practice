package com.library;

public class LibraryService {

	public void showLibrarianDetail(Librarian l) {
		System.err.println(".....Librarian Details.....");
		System.out.println("Librarian Name : " + l.getName());
		System.out.println("Librarian Age : " + l.getAge());
		System.out.println("Librarian Gender : " + l.getGender());
		System.out.println("Librarian ID : " + l.getEmployeeId());
		System.out.println("Librarian Shift : " + l.getShift());
		System.out.println("-----------------------------------------------------");
	}

	public void showMemberDetails(Member m) {
		System.err.println(".....Member Details.....");
		System.out.println("Member Name : " + m.getName());
		System.out.println("Member Age : " + m.getAge());
		System.out.println("Member Gender : " + m.getGender());
		System.out.println("Member ID : " + m.getMemberId());
		System.out.println("Membership type : " + m.getMembershipType());
	}
}
