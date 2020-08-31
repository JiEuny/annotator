package com.semantic.annotator.resource;

public class AirQualityObserved {

    private String id;
    private String type;
    private Location location;
    private Address address;
    private String createdAt;
    private String modifiedAt;
    private IndexRef indexRef;
    private AirQualityObservation airQualityObservation;
    private AirQualityIndexObservation airQualityIndexObservation;

    private class AirQualityObservation {
        private String observedAt;
        private String type;
        private Object value;
        public class AirQualityObservationValue {
            private Number no2;
            private Number o3;
            private Number pm25;
            private Number so2;
            private Number pm10;
            private Number co;
        }
    }

    private class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object coordinates;
        }
    }

    public class AirQualityIndexObservation {
        private String observedAt;
        private String type;
        private AirQualityIndexObservationValue value;
        public class AirQualityIndexObservationValue {
            private String pm10Category;
            private String totalCategory;
            private Number totalIndex;
            private String o3Category;
            private String pm25Category;
            private String no2Category;
            private String coCategory;
            private String so2Category;
        }
    }

    public class IndexRef {
        private String type;
        private String value;
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

    public String getId() {
        return id;
    }

    public Object getLocation() {
        return location;
    }
}
