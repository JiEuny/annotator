package com.semantic.annotator.resource;

public class WeatherForecast {

    private String id;
    private String type;
    private Location location;
    private Address address;
    private String createdAt;
    private String modifiedAt;
    private WeatherPrediction weatherPrediction;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

     public class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object[] coordinates;

            public String getType() {
                return type;
            }

            public Object getCoordinates(int i) {
                return coordinates[i];
            }
        }
        public LocationValue getValue() {
            return value;
        }

    }
    
    public Location getLocation() {
        return location;
    }

    private class WeatherPrediction {
        private String observedAt;
        private String type;
        private WeatherPredictionValue[] value;
        public class WeatherPredictionValue {
            private Number temperature;
            private Number lowestTemperature;
            private Number highestTemperature;
            private Number windSpeed;
            private Number humidity;
            private Number rainfall;
            private Number rainfallProbability;
            private Number rainType;
            private Number snowfall;
            private String predictedAt;

            public Number getTemparature() {
                return temperature;
            }

            public Number getLowestTemperature() {
                return lowestTemperature;
            }

            public Number getHighestTemperature() {
                return highestTemperature;
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

            public Number getRainfallProbability() {
                return rainfallProbability;
            }

            public Number getRainTypey() {
                return rainType;
            }

            public Number getSnowfall() {
                return snowfall;
            }

            public String getPredictedAt() {
                return predictedAt;
            }
        }

        public WeatherPredictionValue getValue(int i) {
            return value[i];
        }

        public String getObservedAt () {
            return observedAt;
        }
    }

    public WeatherPrediction getWeatherPrediction() {
        return weatherPrediction;
    }

    //- CHECK
    public class Address {
        private String type;
        private AddressValue value;
        public class AddressValue {
            private String addressCountry;
            private String streetAddress;
            private String addressLocality;
            private String addressRegion;
            private String addressTown;

            public String getAddressCountry() {
                return addressCountry;
            }

            public String getAddressRegion() {
                return addressRegion;
            }

            public String getAddressLocality() {
                return addressLocality;
            }

            public String getStreetAddress() {
                return streetAddress;
            }

            public String getAddressTown() {
                return addressTown;
            }
        }

        public AddressValue getValue() {
            return value;
        }
    }

    public Address getAddress() {
        return address;
    }

    public Object getAddressCountry() {
        return address.value.addressCountry;
    }

    public Object getAddressRegion() {
        return address.value.addressRegion;
    }

    public Object getAddressLocality() {
        return address.value.addressLocality;
    }

    public Object getStreetAddress() {
        return address.value.streetAddress;
    }

    public Object getAddressTown() {
        return address.value.addressTown;
    }
    //- CHECK
}
