package com.checkweather.duyar.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WeatherLog {

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String responseId;
	@Column
	private String location;
	@Column
	private String actualWeather;
	@Column
	private String temperature;
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date dtimeInserted;

	public WeatherLog() {

	}

	public WeatherLog(String location, String actualWeather, String temperature, String responseId) {
		this.location = location;
		this.actualWeather = actualWeather;
		this.temperature = temperature;
		this.responseId = responseId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActualWeather() {
		return actualWeather;
	}

	public void setActualWeather(String actualWeather) {
		this.actualWeather = actualWeather;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public Date getDtimeInserted() {
		return dtimeInserted;
	}

	public void setDtimeInserted(Date dtimeInserted) {
		this.dtimeInserted = dtimeInserted;
	}

}
