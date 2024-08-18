package com.bdsystems.airport.api.controllers;

import com.bdsystems.airport.api.domains.FlightVo;
import com.bdsystems.airport.api.services.flights.FlightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flight")
public class FlightController {

	private final FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@PostMapping
	public String createProcess(@RequestBody final FlightVo flightVo){
		return flightService.publishMessage(flightVo);
	}
}
