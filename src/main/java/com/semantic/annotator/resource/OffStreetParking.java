package com.semantic.annotator.resource;

import java.util.List;

public class OffStreetParking {

    private String id;
    private String type;
    private Location location;
    private Address address;
    private Name name;
    private Category category;
    private PaymentAccepted paymentAccepted;
    private PriceRate priceRate;
    private PriceCurrency priceCurrency;
    private Image image;
    private TotalSpotNumber totalSpotNumber;
    private AvailableSpotNumber availableSpotNumber;
    private OpeningHours openingHours;
    private ContactPoint contactPoint;
    private LocationTag locationTag;
    private String createdAt;
    private String modifiedAt;
    //    private String parkingLotURI;
    private CongestionIndexPrediction congestionIndexPrediction;
    //    private Object maximumAllowedHeight;
    private Status status;
    private RefParkingSpots refParkingSpots;
//    private String observedAt;
//    private List<String> context;

    public class Status {
        private String type;
        private Object value;
    }

    public class TotalSpotNumber {
        private String type;
        private Number value;
    }

    public class Category {
        private String type;
        private Object value;
    }

    public class RefParkingSpots {
        private String type;
        private Object value;
    }

    public class OpeningHours {
        private String type;
        private Object value;
    }

    private class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object coordinates;
        }
    }

    public class Name {
        private String type;
        private String value;
    }

    public class CongestionIndexPrediction {
        private String observedAt;
        private String type;
        private CongestionIndexPredictionValue value;
        public class CongestionIndexPredictionValue {
            private Object predictedAt;
            private Object index;
        }
    }

    public class AvailableSpotNumber {
        private String type;
        private Number value;
    }

    public class PriceCurrency {
        private String type;
        private Object value;
    }

    public class LocationTag {
        private String type;
        private String value;
    }

    public class ContactPoint {
        private String type;
        private ContactPointValue value;
        public class ContactPointValue {
            private String telephone;
            private String contactType;
            private String email;
        }
    }

    public class Address {
        private String type;
        private AddressValue value;
        public class AddressValue {
            private String addressCountry;
            private String streetAddress;
            private String addressLocality;
            private String addressRegion;
            private String addressTown;
        }
    }

    public class PriceRate {
        private String type;
        private String value;
    }

    public class Image {
        private String type;
        private String value;
    }

    public class PaymentAccepted {
        private String type;
        private Object value;
    }

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
