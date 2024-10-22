package com.example.demo.services;

import com.example.demo.models.Weather;

public interface WeatherService {

    Weather getCurrentWeatherDetails(double lat, double lan, String apiKey);

    Weather getForecastWeatherDetails(double lat, double lan, String apiKey);
}
