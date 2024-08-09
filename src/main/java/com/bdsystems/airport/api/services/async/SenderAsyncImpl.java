package com.bdsystems.airport.api.services.async;

import com.bdsystems.airport.api.domains.FlightMo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderAsyncImpl implements SenderAsync {

	private final KafkaTemplate<String, Object> kafkaTemplate;
	@Value("${kafka.topic.check-in}")
	private String topic;

	public SenderAsyncImpl(KafkaTemplate<String, Object> kafkaTemplate
	) {
		this.kafkaTemplate = kafkaTemplate;

	}

	@Override
	public String publishMessage(FlightMo messageVo) {
		kafkaTemplate.send(topic, messageVo);
		return "Created process to routing for the process ";
	}
}
