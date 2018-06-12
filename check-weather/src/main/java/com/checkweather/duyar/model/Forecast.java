package com.checkweather.duyar.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Forecast {

	private String dateFormatted;
	private Long date;
	@JsonProperty("weather")
	private List<Weather> weather;
	@JsonProperty("main")
	private Temperature temp;

	public Long getDate() {
		return date;
	}

	@JsonSetter("dt")
	public void setDate(Long date) {
		this.date = date;
	}

	public Temperature getTemp() {
		return temp;
	}

	public void setTemp(Temperature temp) {
		this.temp = temp;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	@JsonGetter("dateFormatted")
	public String getDateFormatted() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date newDate = new Date(date*1000L);
		return sdf.format(newDate);
	}

	public void setDateFormatted(String dateFormatted) {
		this.dateFormatted = dateFormatted;
	}

}
