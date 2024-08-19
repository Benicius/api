package com.bdsystems.airport.api.services.flights;

import com.bdsystems.airport.api.domains.Flight;
import com.bdsystems.airport.api.domains.FlightVo;

public interface FlightService {

	Flight save(FlightVo flight);
	String publishMessage(FlightVo flightVo);
}
