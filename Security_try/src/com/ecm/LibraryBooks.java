package com.ecm;

public class LibraryBooks {
	private int bookId;
	private String title;
	private String author;

	LibraryBooks(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void Display() {
		System.out.println("The ID of the Book is " + bookId);
		System.err.println("The Title of the Book is " + title);
		System.out.println("The Author of the Book is " + author);
		System.out.println("----------------------------------------------------");
	}

}
