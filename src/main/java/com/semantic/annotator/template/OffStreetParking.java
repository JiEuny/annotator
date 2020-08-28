package com.semantic.annotator.template;

import java.util.List;

public class OffStreetParking {

    private String id;
    private String type;
    private Object location;
    private Object address;
    private Object name;
    private Object category;
    private Object paymentAccepted;
    private Object priceRate;
    private Object priceCurrency;
    private Object image;
    private Object totalSpotNumber;
    private Object availableSpotNumber;
    private Object openingHours;
    private Object contactPoint;
    private Object locationTag;
    private String createdAt;
    private String modifiedAt;
//    private String parkingLotURI;
    private Object congestionIndexPrediction;
//    private Object maximumAllowedHeight;
    private Object status;
    private Object refParkingSpots;
//    private String observedAt;
//    private List<String> context;

    public String getId() {
        return id;
    }

    public Object getRefParkingSpots() {
        return refParkingSpots;
    }
//
//    public OffStreetParking(OffStreetParking builder) {
//
//        id = builder.id;
//        type = builder.type;
//    }

//    public String toString() {
//        return "id:" + id;
//    }
//
//    public OffStreetParking toOff() {
//        return OffStreetParking;
//    }
}
