package com.example.demo.controller;

import com.example.demo.models.Weather;
import com.example.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

//    https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

//    http://localhost:8080/data/weather?lat=44.34&lon=10.19&appid=8ca59434cc974f57407ef758f08be7f9

//    http://localhost:8080/data/forecast/hourly?lat=44.34&lon=10.19&appid=8ca59434cc974f57407ef758f08be7f9

    @GetMapping("/weather")
    private ResponseEntity<Weather> getCurrentWeather(@RequestParam double lat, @RequestParam double lon, @RequestParam String apiKey) {
        if(apiKey == null){
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }

        Weather weather = weatherService.getCurrentWeatherDetails(lat,lon,apiKey);
        return new ResponseEntity<Weather>(weather,HttpStatusCode.valueOf(200));
    }

//    https://pro.openweathermap.org/data/2.5/forecast/hourly?lat={lat}&lon={lon}&appid={API key}
    @GetMapping("/forecast/hourly")
    private ResponseEntity<Weather> getForecastWeather(@RequestParam double lat, @RequestParam double lon,@RequestParam String apiKey) {
        if(apiKey == null){
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }

        Weather weather = weatherService.getForecastWeatherDetails(lat,lon,apiKey);
        return new ResponseEntity<Weather>(weather,HttpStatusCode.valueOf(200));
    }
}
