package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.BookingService;

@Component
public class ConstructorInjection {
	
	@Autowired
	
private BookingService bookingService;
	
	@Autowired
	
	public ConstructorInjection(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
		
		
	}
	
	public String booking() {
		return bookingService.bookTrip();
	}

}
