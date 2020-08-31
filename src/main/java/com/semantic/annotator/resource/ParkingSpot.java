package com.semantic.annotator.resource;

import java.util.Arrays;
import java.util.List;

public class ParkingSpot {

    private String id;
    private String type;
    private Location location;
    private Address address;
    private Name name;
    private Category category;
    private String createdAt;
    private String modifiedAt;
    private Status status;
    private RefParkingLot refParkingLot;
    private Lenth lenth;
    private Width width;

    public String getId() {
        return id;
    }

    public Object getRefParkingLot() {
        return refParkingLot;
    }

    private class Status {
        private String type;
        private String value;
    }

    private class Category {
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

    public class Width {
        private String type;
        private String value;
    }

    public class Name {
        private String type;
        private String value;
    }

    public class RefParkingLot {
        private String type;
        private String value;
    }

    public class Lenth {
        private String type;
        private Number value;
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

    public Object getAdd() {
        return address.value.addressCountry;
    }

}

