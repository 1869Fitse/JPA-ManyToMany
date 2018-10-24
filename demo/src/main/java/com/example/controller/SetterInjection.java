package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.BookingService;
@Component
public class SetterInjection {
	private BookingService bookingService;
	

	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public String booking() {
		System.out.println("This is from setter injections");
		return bookingService.bookTrip();
	}

}
