package com.semantic.annotator.resource;

import com.semantic.annotator.resource.Address;

public class WeatherObserved {

    private String id;
    private String type;
    private String createdAt;
    private String modifiedAt;
    private Location location;
    private Address address;
    private WeatherObservation weatherObservation;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    private class Location {
        private String type;
        private LocationValue value;
        private String observedAt;

        public class LocationValue {
            private String type;
            //CHECK Latitute, Longitute
            private Object coordinates;

            public String getType() {
                return type;
            }

            public Object getCoordinates() {
                return coordinates;
            }
        }

        public String getType() {
            return type;
        }

        public LocationValue getValue() {
            return value;
        }

        public String getObservedAt() {
            return observedAt;
        }
    }

    public Location getLocation() {
        return location;
    }


    public Address getAddress() {
        return address;
    }

    public static class WeatherObservation {
        private String type;
        private WeatherObservationValue value;
        private String observedAt;

        private class WeatherObservationValue {
            private Number temperature;
            private Number windSpeed;
            private Number humidity;
            private Number rainfall;
            private Number hourlyRainfall;
            private String rainType;
            private Number snowfall;
            private Number visibility;

            public Number getTemperature() {
                return temperature;
            }

            public Number getWindSpeed() {
                return windSpeed;
            }

            public Number getHumidity() {
                return humidity;
            }

            public Number getRainfall() {
                return rainfall;
            }

            public Number getHourlyRainfall() {
                return hourlyRainfall;
            }

            public String getRainType() {
                return rainType;
            }

            public Number getSnowfall() {
                return snowfall;
            }

            public Number getVisibility() {
                return visibility;
            }
        }

        public String getType() {
            return type;
        }

        public WeatherObservationValue getValue() {
            return value;
        }

        public String getObservedAt() {
            return observedAt;
        }
    }

    public WeatherObservation getWeatherObservation() {
        return weatherObservation;
    }
}
