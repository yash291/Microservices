package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	// When you annotate a RestTemplate or WebClient bean with @LoadBalanced, Spring
	// intercepts requests sent through that bean. When a request is made to a
	// service name (e.g., using a URL with the service name), Spring resolves the
	// service name to the actual location (host and port) by querying the Eureka
	// Server.
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
