package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.BookingService;
@Component
public class PropertyInjector {
	@Autowired
	private BookingService bookingService;
	
	public String booking() {
		
		return bookingService.bookTrip();
	}

}
