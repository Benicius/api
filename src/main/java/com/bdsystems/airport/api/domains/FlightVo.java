package com.bdsystems.airport.api.domains;

import java.time.LocalDate;
import java.time.LocalTime;

public record FlightVo(
				String passengerName,
				String flightReference,
				LocalDate flightDate,
				LocalTime flightTime,
				FlightType flightType,
				BagType bagType
) {

	public Flight converterToEntity(){
		return Flight.builder()
						.bagType(this.bagType)
						.flightDate(this.flightDate != null ? this.flightDate : LocalDate.now())
						.flightReference(this.flightReference)
						.flightTime(this.flightTime != null ? this.flightTime : LocalTime.now())
						.flightType(this.flightType)
						.passengerName(this.passengerName)
						.build();
	}
}
