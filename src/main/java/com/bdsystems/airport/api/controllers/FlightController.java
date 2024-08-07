package com.bdsystems.airport.api.controllers;

import com.bdsystems.airport.api.domains.Flight;
import com.bdsystems.airport.api.domains.FlightVo;
import com.bdsystems.airport.api.services.flights.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	/*@PostMapping
	public ResponseEntity<Flight> createFlight(@RequestBody final FlightVo flightVo){

		return new ResponseEntity<>(flightService.save(flightVo), HttpStatus.CREATED);
	}*/

	@PostMapping
	public String createProcess(@RequestBody final FlightVo flightVo){
		return flightService.publishMessage(flightVo);
	}
}
