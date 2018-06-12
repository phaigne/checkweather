package com.checkweather.duyar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.checkweather.duyar.model.CityWeather;
import com.checkweather.duyar.model.Forecast;
import com.checkweather.duyar.model.Request;
import com.checkweather.duyar.model.WeatherLog;
import com.checkweather.duyar.repository.WeatherRepository;

@Service
public class WeatherService {

	private String URL = "http://api.openweathermap.org/data/2.5/forecast?q=%s&APPID=b74d1b26c8e8c26165dfba2c43ebfe38";

	RestTemplate restTemplate;

	@Autowired
	private WeatherRepository weatherRepository;

	public List<CityWeather> getCityWeather(Request request) {
		restTemplate = new RestTemplate();
		List<CityWeather> cityWeatherList = new ArrayList<CityWeather>();
		for (String city : request.getCities()) {
			CityWeather cityWeather = restTemplate.getForObject(String.format(URL, city), CityWeather.class);
			cityWeatherList.add(cityWeather);
		}
		saveCityWeather(cityWeatherList);
		return cityWeatherList;
	}

	private void saveCityWeather(List<CityWeather> cityWeatherList) {
		for (CityWeather cityWeather : cityWeatherList) {
			for (Forecast forecast : cityWeather.getForecastList().subList(cityWeather.getForecastList().size() - 5,
					cityWeather.getForecastList().size())) {
				UUID uuid = UUID.randomUUID();
		        String randomUUIDString = uuid.toString();
				if (forecast.getWeather() != null && !forecast.getWeather().isEmpty())
					weatherRepository.save(new WeatherLog(cityWeather.getCity().getCity(),
							forecast.getWeather().get(0).getDescWeather(), forecast.getTemp().getTemp(), randomUUIDString));
			}
		}
	}
}
