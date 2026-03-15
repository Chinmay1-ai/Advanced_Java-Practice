package com.movieapp;

public abstract class MovieService {

	public abstract void selectMovie();
	
	
	public abstract double calculateTicketPrice(int seats) ;

	public void bookTicket(Payment p, double amount) {
		p.pay(amount);
		System.out.println("Ticket Booked Succesfully");
	}
}
