package com.checkweather.duyar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.checkweather.duyar.model.WeatherLog;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherLog, Long> {

}
