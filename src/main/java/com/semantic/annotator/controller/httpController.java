package com.semantic.annotator.controller;

import com.google.gson.*;
import com.semantic.annotator.resource.AirQualityObserved;
import com.semantic.annotator.resource.OffStreetParking;
import com.semantic.annotator.resource.ParkingSpot;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

@Controller
public class httpController {

    OffStreetParking[] offStreetParkings;
    ParkingSpot[] parkingSpots;
    List<OffStreetParking> offStreetParkingList;
    List<ParkingSpot> parkingSpotList;
    AirQualityObserved[] airQualityObserveds;
    List<AirQualityObserved> airQualityObservedList;

    @RequestMapping("/")
    public String getEntities() {

        RestTemplate restTemplate = new RestTemplate();

//        String url = "http://192.168.0.20:8080/entities?type=";
        String url = "http://localhost:8080/entities?type=";

//        String url = "http://localhost:12345";

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

        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = new JsonArray();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Map<String, Object> temp = new LinkedHashMap<>();

        for(int i = 0; i < type.size(); i++ ) {
            String result = restTemplate.exchange(url+type.get(i), HttpMethod.GET, entity, String.class).getBody();

            switch (i) {
                case 0:
                    offStreetParkings = gson.fromJson(result, OffStreetParking[].class);
                    offStreetParkingList = Arrays.asList(offStreetParkings);
//                    System.out.println(gson.toJson(offStreetParkingList));

                    break;
                case 1:
                    parkingSpots = gson.fromJson(result, ParkingSpot[].class);
                    parkingSpotList = Arrays.asList(parkingSpots);
//                    System.out.println(gson.toJson(parkingSpotList));
                    break;
                case 2:
                    airQualityObserveds = gson.fromJson(result, AirQualityObserved[].class);
                    airQualityObservedList = Arrays.asList(airQualityObserveds);
                    break;
            }
        }

        Map<String, Object> test = new LinkedHashMap<>();

//        String result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();

//        JsonArray entities = (JsonArray) new JsonParser().parse(result);
////        System.out.println(entities.get(0));
//        JsonObject object = (JsonObject) entities.get(0);
//
////        System.out.println(object.get("id"));
////        System.out.println(((JsonObject)entities.get(0)).get("id"));



//        OffStreetParking[] w = gson.fromJson(result, OffStreetParking[].class);
//        List<OffStreetParking> list = Arrays.asList(w);

//        System.out.println(gson.toJson(list));
        System.out.println(gson.toJson(offStreetParkingList.get(0)));
//        System.out.println(offStreetParkingList.get(0));
//        System.out.println(parkingSpotList.get(0));
//        ParkingSpot spot = parkingSpotList.get(0);



        System.out.println(offStreetParkingList.get(0).getOpeningHours().getValue());


        return "test";
    }
}
