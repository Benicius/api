package com.bdsystems.airport.api.domains;

import java.time.LocalDate;
import java.time.LocalTime;

public record FlightMo(
				Long id,
				String passengerName,
				String flightReference,
				LocalDate flightDate,
				LocalTime flightTime,
				FlightType flightType,
				BagType bagType
) {
}
