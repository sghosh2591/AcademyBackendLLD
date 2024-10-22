package com.example.demo.services;

import com.example.demo.dto.CurrentWeatherDto;
import com.example.demo.models.Weather;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherOpenService implements WeatherService {

    @Override
    public Weather getCurrentWeatherDetails(double lat, double lan, String apiKey) {

        String url = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lan+"&appid="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        CurrentWeatherDto weatherDto = restTemplate.getForObject(url, CurrentWeatherDto.class);

        return convertToWeather(weatherDto);
    }

    @Override
    public Weather getForecastWeatherDetails(double lat, double lan, String apiKey) {

        String url = "https://pro.openweathermap.org/data/2.5/weather/forecast/hourly?lat="+lat+"&lon="+lan+"&appid="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        CurrentWeatherDto weatherDto = restTemplate.getForObject(url, CurrentWeatherDto.class);
        return convertToWeather(weatherDto);
    }

    private Weather convertToWeather(CurrentWeatherDto weather) {
        Weather weatherDto = new Weather();
        weatherDto.setId(weather.getId());
        weatherDto.setVisibility(weather.getVisibility());
        weatherDto.setName(weather.getName());
        return weatherDto;
    }
}
