package com.bdsystems.airport.api.configs;

import feign.Contract;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class FeignConfiguration {
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
	@Bean
	public FeignClientProperties feignClientProperties() {
		return new FeignClientProperties();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
