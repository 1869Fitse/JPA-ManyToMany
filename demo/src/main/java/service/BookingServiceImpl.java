package service;

import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
	
	public String bookTrip() {
		String str ="This method for booking the trip for customer";
		System.out.println(str);
		return str;
	}

}
