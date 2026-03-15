package com.movieapp;

public class OnlineService extends MovieService {

	@Override
	public double calculateTicketPrice(int seats) {
		double pricePerTicket = 200;
		double convenienceFee = 50;
		return (seats * pricePerTicket) + convenienceFee;
	}

	@Override
	public void selectMovie() {
		System.out.println("Online Movie Selected: AVENGERS");
	}
}