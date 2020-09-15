package com.semantic.annotator.annotation;

import com.semantic.annotator.correlationSeeker.ParkingSpotSeeker;
import com.semantic.annotator.resource.ParkingSpot;
import com.semantic.annotator.resourceDTO.ParkingSpotDTO;

public class ParkingSpotAnnotation {

    String graph_name = "http://www.city-hub.kr/ontologies/2019/1/parking#";
    String template = "\\src\\main\\java\\com\\semantic\\Annotator\\template\\ParkingSpot.json";

    public ParkingSpotAnnotation(ParkingSpot data) {

        ParkingSpotSeeker spotSeeker = new ParkingSpotSeeker();
        ParkingSpotDTO mappedParkingSpotDTO = spotSeeker.map(data, ParkingSpotDTO.class);
        System.out.println(mappedParkingSpotDTO);

    }
}
