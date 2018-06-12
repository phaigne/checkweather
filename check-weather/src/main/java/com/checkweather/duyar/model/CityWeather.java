package com.checkweather.duyar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CityWeather {

	@JsonProperty("city")
	private City city;
	List<Forecast> forecastList;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@JsonGetter("forecastList")
	public List<Forecast> getForecastList() {
		return forecastList;
	}

	@JsonSetter("list")
	public void setForecastList(List<Forecast> forecastList) {
		this.forecastList = forecastList;
	}

}
