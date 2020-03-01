package com.spring.rest.gateway.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.gateway.model.ClientData;

@RestController
public class ClientController {

	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public ClientData greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new ClientData(counter.incrementAndGet(), String.format(template, name));
	}
	
}
