package com.spring.rest.gateway.model;

public class ClientData {
	
	private final long id;
	private final String name;

	public ClientData(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
