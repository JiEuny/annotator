package com.semantic.annotator.controller;

import com.google.gson.*;
import com.semantic.annotator.annotation.*;
import com.semantic.annotator.correlationSeeker.*;
import com.semantic.annotator.resource.*;
import com.semantic.annotator.resourceDTO.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.List;

//@Controller
public class HttpController {

    OffStreetParking[] offStreetParkings;
    List<OffStreetParking> offStreetParkingList;
    ParkingSpot[] parkingSpots;
    List<ParkingSpot> parkingSpotList;
    AirQualityObserved[] airQualityObserveds;
    List<AirQualityObserved> airQualityObservedList;
    AirQualityForecast[] airQualityForecasts;
    List<AirQualityForecast> airQualityForecastList;
    WeatherObserved[] weatherObserveds;
    List<WeatherObserved> weatherObservedList;
    WeatherForecast[] weatherForecasts;
    List<WeatherForecast> weatherForecastList;

//    @RequestMapping("/")
    public String getEntities() {

        RestTemplate restTemplate = new RestTemplate();

//        String url = "http://192.168.0.20:8080/entities?type=";
//        String url = "http://192.168.0.103:8080/entities?type=";
        String url = "http://localhost:8080/entities?type=";

        List<String> type = new ArrayList<>();
        type.add("OffStreetParking");
        type.add("ParkingSpot");
        type.add("AirQualityObserved");
        type.add("AirQualityForecast");
        type.add("WeatherObserved");
        type.add("WeatherForecast");

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/ld+json");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for(int i = 0; i < type.size(); i++ ) {
            String result = restTemplate.exchange(url+type.get(i), HttpMethod.GET, entity, String.class).getBody();

            switch (i) {
                case 0:
                    offStreetParkings = gson.fromJson(result, OffStreetParking[].class);
                    offStreetParkingList = Arrays.asList(offStreetParkings);
                    break;
                case 1:
                    parkingSpots = gson.fromJson(result, ParkingSpot[].class);
                    parkingSpotList = Arrays.asList(parkingSpots);
                    break;
                case 2:
                    airQualityObserveds = gson.fromJson(result, AirQualityObserved[].class);
                    airQualityObservedList = Arrays.asList(airQualityObserveds);
                    break;
                case 3:
                    airQualityForecasts = gson.fromJson(result, AirQualityForecast[].class);
                    airQualityForecastList = Arrays.asList(airQualityForecasts);
                    break;
                case 4:
                    weatherObserveds = gson.fromJson(result, WeatherObserved[].class);
                    weatherObservedList = Arrays.asList(weatherObserveds);
                    break;
                case 5:
                    weatherForecasts = gson.fromJson(result, WeatherForecast[].class);
                    weatherForecastList = Arrays.asList(weatherForecasts);
            }
        }

        for(int i = 0; i< offStreetParkingList.size(); i++) {
            OffStreetParkingAnnotation parkingAnnotation = new OffStreetParkingAnnotation(offStreetParkingList.get(i));
        }

        for(int i = 0; i<parkingSpotList.size(); i++) {
            ParkingSpotAnnotation parkingSpotAnnotation = new ParkingSpotAnnotation(parkingSpotList.get(i));
        }

        for(int i = 0; i<airQualityObservedList.size(); i++) {
            AirObservedAnnotation airObservedAnnotation = new AirObservedAnnotation(airQualityObservedList.get(i));
        }

        for(int i = 0; i<airQualityForecastList.size(); i++) {
            AirForecastAnnotation airForecastAnnotation = new AirForecastAnnotation(airQualityForecastList.get(i));
        }

        for (int i = 0; i<weatherObservedList.size(); i++) {
            WeatherObservedAnnotation weatherObservedAnnotation = new WeatherObservedAnnotation(weatherObservedList.get(i));
        }

        for(int i = 0; i<weatherForecastList.size(); i++) {
            WeatherForecastAnnotation weatherForecastAnnotation = new WeatherForecastAnnotation(weatherForecastList.get(i));
        }

        return "test";
    }
}
