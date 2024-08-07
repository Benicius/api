package com.bdsystems.airport.api.domains;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
public record FlightMo(
				Long id,
				String passengerName,
				String flightReference,
				LocalDate flightDate,
				LocalTime flightTime,
				FlightType flightType,
				BagType bagType
) {

	public FlightVo convertToMessage(){
		return FlightVo.builder()
						.id(this.id)
						.bagType(this.bagType)
						.flightDate(this.flightDate != null ? this.flightDate : LocalDate.now())
						.flightReference(this.flightReference)
						.flightTime(this.flightTime != null ? this.flightTime : LocalTime.now())
						.flightType(this.flightType)
						.passengerName(this.passengerName)
						.build();
	}
}
