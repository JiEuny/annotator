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
        private AirQualityObservationValue value;
        public class AirQualityObservationValue {
            private Number no2;
            private Number o3;
            private Number pm25;
            private Number so2;
            private Number pm10;
            private Number co;

            public Number getNO2() {
                return no2;
            }

            public Number getO3() {
                return o3;
            }

            public Number getPM25() {
                return pm25;
            }

            public Number getSO2() {
                return so2;
            }

            public Number getPM10() {
                return pm10;
            }

            public Number getCO() {
                return co;
            }
        }

        public AirQualityObservationValue getValue() {
            return value;
        }

        public String getObservedAt () {
            return observedAt;
        }
    }

    public AirQualityObservation getAirQualityObservation() {
        return airQualityObservation;
    }

    private class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object coordinates;
        
            public String getType() {
                return type;
            }

            public Object getCoordinates() {
                return coordinates;
            }
       }

        public LocationValue getValue() {
            return value;
        }
    }

    public Location getLocation() {
        return location;
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

            public String getPM10Category() {
                return pm10Category;
            }

            public String getTotalCategory() {
                return totalCategory;
            }

            public Number getTotalIndex() {
                return totalIndex;
            }

            public String getO3Category() {
                return o3Category;
            }

            public String getPM25Category() {
                return pm25Category;
            }

            public String getNO2Category() {
                return no2Category;
            }

            public String getCOCategory() {
                return coCategory;
            }

            public String getSO2Category() {
                return so2Category;
            }
        }

        public AirQualityIndexObservationValue getValue() {
            return value;
        }

        public String getObservedAt() {
            return observedAt;
        }
    }

    public AirQualityIndexObservation getAirQualityIndexObservation() {
        return airQualityIndexObservation
    }

    public class IndexRef {
        private String type;
        private String value;

        public Object getValue() {
            return value;
        }
    }

    public IndexRef getIndexRef() {
        return indexRef;
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
}
