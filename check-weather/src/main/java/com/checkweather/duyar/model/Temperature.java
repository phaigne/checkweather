package com.checkweather.duyar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {

	@JsonProperty("temp")
	private String temp;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
	
}
