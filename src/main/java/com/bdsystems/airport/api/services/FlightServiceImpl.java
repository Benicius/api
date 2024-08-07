package com.bdsystems.airport.api.services;

import com.bdsystems.airport.api.domains.Flight;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

	private final FlightRepository flightRepository;

	public FlightServiceImpl(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	@Override
	public Flight save(Flight flight) {
		return flightRepository.save(flight);
	}

}
