package com.oop;

public class LibraryInfo {

	    String bookName;
	    String author;
	    int bookId;
	    String publication;
	    int totalPages;
	    float bookPrice;
	    boolean isAvailable;
	    String category;
	    int issuedDays;
	    char shelfNo;

	    public static void main(String[] args) {

	        LibraryInfo lib = new LibraryInfo();

	        String myBook = lib.bookName = "Atomic Habits";
	        String myAuthor = lib.author = "James Clear";
	        int myId = lib.bookId = 2001;
	        String myPub = lib.publication = "Penguin";
	        int myPages = lib.totalPages = 320;
	        float myPrice = lib.bookPrice = 450.75f;
	        boolean myStatus = lib.isAvailable = true;
	        String myCat = lib.category = "Self Help";
	        int myIssue = lib.issuedDays = 15;
	        char myShelf = lib.shelfNo = 'D';

	        System.err.println("Library Book Details...!");
	        System.out.println(" Book Name = " + myBook);
	        System.out.println(" Author = " + myAuthor);
	        System.out.println(" Book ID = " + myId);
	        System.out.println(" Publication = " + myPub);
	        System.out.println(" Total Pages = " + myPages);
	        System.out.println(" Price = " + myPrice);
	        System.out.println(" Available = " + myStatus);
	        System.out.println(" Category = " + myCat);
	        System.out.println(" Issued Days = " + myIssue);
	        System.out.println(" Shelf Number = " + myShelf);
	    }
	}

