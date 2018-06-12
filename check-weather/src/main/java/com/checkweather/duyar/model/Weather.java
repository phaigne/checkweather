package com.checkweather.duyar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	@JsonProperty("main")
	private String mainWeather;
	@JsonProperty("description")
	private String descWeather;
	
	public String getMainWeather() {
		return mainWeather;
	}
	public void setMainWeather(String mainWeather) {
		this.mainWeather = mainWeather;
	}
	public String getDescWeather() {
		return descWeather;
	}
	public void setDescWeather(String descWeather) {
		this.descWeather = descWeather;
	}
	
}
