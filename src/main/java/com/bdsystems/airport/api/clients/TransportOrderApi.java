package com.bdsystems.airport.api.clients;

import com.bdsystems.airport.api.domains.TransportOrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "transportOrderApi", url = "localhost:8091/api/v1")
public interface TransportOrderApi {

	@PostMapping(value = "/transport-order", consumes = "application/json")
	TransportOrderVO createTransportOrder(@RequestBody TransportOrderVO transportOrderVO);
}
