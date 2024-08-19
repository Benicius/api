package com.bdsystems.airport.api.domains;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TransportOrderVO(
				Long id,
				String reference,
				String flightType,
				LocalDateTime createAt,
				LocalDateTime updatedAt,
				String status
) {
}
