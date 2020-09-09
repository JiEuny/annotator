package com.semantic.annotator.resource;

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

    public class Address {
        private String type;
        private AddressValue value;
        public class AddressValue {
            private String addressCountry;
            private String addressRegion;
            private String addressLocality;
            private String streetAddress;
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

        public AddressValue getValue() { return value; }
    }

    public Address getAddress() {
        return address;
    }

    //- CHECK
    public String getAddressCountry() {
        return address.value.addressCountry;
    }

    public String getAddressRegion() {
        return address.value.addressRegion;
    }

    public String getAddressLocality() {
        return address.value.addressLocality;
    }

    public String getStreetAddress() {
        return address.value.streetAddress;
    }

    public String getAddressTown() {
        return address.value.addressTown;
    }
    //-- CHECK

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
