package com.movieapp;

public class OfflineService extends MovieService {

	@Override
	public double calculateTicketPrice(int seats) {
		double pricePerTicket = 180;
		return seats * pricePerTicket;
	}

	@Override
	public void selectMovie() {
		System.out.println("Offline Movie Selected: AVENGERS");
	}
}
