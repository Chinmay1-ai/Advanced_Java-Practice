package com.ecm;

public class LibraryInfo {

	public static void main(String[] args) {
		
		LibraryBooks l = new LibraryBooks(111, "Harry Potter", "J K Rowling");
		LibraryBooks l1 = new LibraryBooks(112, "Game of Thrones", "George Martin");
		LibraryBooks l2 = new LibraryBooks(113, "Lords of the Rings", "JRR Tolkein");
		
		l.Display();
		l1.Display();
		l2.Display();
	}
}
