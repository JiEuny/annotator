package com.semantic.annotator.resource;

public class Location {
    //GeoProperty
    private String type;
    private LocationValue value;

    public class LocationValue {
        //Point, MultiPolygon
        private String type;
        private LocationCoordinate[] coordinates;

        private class LocationCoordinate {
            private Number latitude;
            private Number longitude;
        }

        public String getType() {
            return type;
        }

        public LocationCoordinate[] getCoordinates() {
            return coordinates;
        }

        public LocationCoordinate getCoordinates(int index) {
            return coordinates[index];
        }
    }

    public String getType() {
        return type;
    }

    public LocationValue getValue() {
        return value;
    }
}
