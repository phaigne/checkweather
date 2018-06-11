package com.checkweather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

	RestTemplate restTemplate;
	
	@RequestMapping(method = RequestMethod.GET, value = "/checkweather")
	public @ResponseBody String checkWeather() {
		String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=b74d1b26c8e8c26165dfba2c43ebfe38";
		final String responseBody = restTemplate.getForObject(url, String.class);
		return responseBody;
	}
}
