package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sun.org.slf4j.internal.LoggerFactory;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
public class CircuitBreakerController {
	
	private com.sun.org.slf4j.internal.Logger logger=LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("/sample-api")
	//@Retry(name="sample-api",fallbackMethod ="hardcodedResponse")
	//@CircuitBreaker(name="sample-api",fallbackMethod ="hardcodedResponse")
	@RateLimiter(name="default")
	public String sampleApi() {
		
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("https://localhost:8080/some-Dummy-url", String.class);
//		return forEntity.getBody();
		return "sample-api";
	}
	
	public String hardcodedResponse(Exception ex) {
		return "fallback response";
	}
}
