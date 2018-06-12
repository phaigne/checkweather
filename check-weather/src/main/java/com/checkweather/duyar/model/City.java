package com.checkweather.duyar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

	@JsonProperty("name")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
