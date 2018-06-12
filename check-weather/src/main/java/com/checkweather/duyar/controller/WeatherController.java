package com.checkweather.duyar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.checkweather.duyar.model.CityWeather;
import com.checkweather.duyar.model.Request;
import com.checkweather.duyar.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/checkweather", produces = "application/json; charset=UTF-8")
	public @ResponseBody List<CityWeather> checkWeather(@RequestBody Request request) {
		List<CityWeather> responseBody = weatherService.getCityWeather(request);
		return responseBody;
	}
}
