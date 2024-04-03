package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallBack() {
		return "User Service is down at this time";
	}
	
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "Contact Service us down at this time";
	}
	
	
	
}
