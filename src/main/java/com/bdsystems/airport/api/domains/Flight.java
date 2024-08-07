package com.bdsystems.airport.api.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

	@Id
	@GeneratedValue
	private Long id;

	private String passengerName;
	private String flightReference;
	private LocalDate flightDate;
	private LocalTime flightTime;

	@Enumerated(EnumType.STRING)
	private FlightType flightType;

	@Enumerated(EnumType.STRING)
	private BagType bagType;

}
