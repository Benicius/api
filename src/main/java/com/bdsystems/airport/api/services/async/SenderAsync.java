package com.bdsystems.airport.api.services.async;

import com.bdsystems.airport.api.domains.FlightMo;


public interface SenderAsync {

	String publishMessage(FlightMo flightVo);
}
