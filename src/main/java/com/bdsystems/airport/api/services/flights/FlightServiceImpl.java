package com.bdsystems.airport.api.services.flights;

import com.bdsystems.airport.api.clients.TransportOrderApi;
import com.bdsystems.airport.api.domains.Flight;
import com.bdsystems.airport.api.domains.FlightMo;
import com.bdsystems.airport.api.domains.FlightVo;
import com.bdsystems.airport.api.domains.TransportOrderVO;
import com.bdsystems.airport.api.services.async.SenderAsync;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FlightServiceImpl implements FlightService {

	private final FlightRepository flightRepository;
	private final SenderAsync senderAsync;
	private final TransportOrderApi transportOrderApi;

	public FlightServiceImpl(FlightRepository flightRepository, SenderAsync senderAsync, TransportOrderApi transportOrderApi) {
		this.flightRepository = flightRepository;
		this.senderAsync = senderAsync;
		this.transportOrderApi = transportOrderApi;
	}

	@Override
	public Flight save(FlightVo flightVo) {
		var flight = flightVo.converterToEntity();
		return flightRepository.save(flight);
	}

	@Override
	public String publishMessage(FlightVo flightVO) {
		FlightMo flightMO = flightVO.convertToMessage();

		this.save(flightMO.convertToMessage());
		TransportOrderVO transportOrder = TransportOrderVO.builder()
						.flightType(flightVO.flightType().name())
						.status("STARTED")
						.createAt(LocalDateTime.now())
						.updatedAt(LocalDateTime.now())
						.reference(flightVO.flightReference()).build();

		transportOrderApi.createTransportOrder(transportOrder);
		return senderAsync.publishMessage(flightVO.convertToMessage());
	}


}
