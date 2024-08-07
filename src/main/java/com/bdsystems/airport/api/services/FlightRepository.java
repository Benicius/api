package com.bdsystems.airport.api.services;

import com.bdsystems.airport.api.domains.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
