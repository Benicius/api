package com.bdsystems.airport.api.services.flights;

import com.bdsystems.airport.api.domains.Flight;
import com.bdsystems.airport.api.domains.FlightVo;
import com.bdsystems.airport.api.services.async.SenderAsync;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

	private final FlightRepository flightRepository;
	private final SenderAsync senderAsync;

	public FlightServiceImpl(FlightRepository flightRepository, SenderAsync senderAsync) {
		this.flightRepository = flightRepository;
		this.senderAsync = senderAsync;
	}

	@Override
	public Flight save(FlightVo flightVo) {
		var flight = flightVo.converterToEntity();
		return flightRepository.save(flight);
	}

	@Override
	public String publishMessage(FlightVo flightMo) {
		return senderAsync.publishMessage(flightMo.convertToMessage());
	}


}
