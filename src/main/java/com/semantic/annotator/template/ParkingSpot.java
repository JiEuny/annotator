package com.semantic.annotator.template;

import java.util.List;

public class ParkingSpot {

    private String id;
    private String type;
    private Object location;
    private Address address;
    private Object name;
    private Object category;
    private String createdAt;
    private String modifiedAt;
    private Object status;
    private Object refParkingLot;
    private Object lenth;
    private Object width;

    public String getId() {
        return id;
    }

    public Object getRefParkingLot() {
        return refParkingLot;
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
