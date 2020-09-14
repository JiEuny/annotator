package com.semantic.annotator.resource;

public class AirQualityForecast {

    private String id;
    private String type;
    private Location location;
    private Address address;
    private String createdAt;
    private String modifiedAt;
    private IndexRef indexRef;
    private AirQualityPrediction airQualityPrediction;
    private AirQualityIndexPrediction airQualityIndexPrediction;

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

    public Location getLocation() {
        return location;
    }

    public Address getAddress() {
        return address;
    }

    public class AirQualityPrediction {
        private String observedAt;
        private String type;
        private Object value;
//        private AirQualityPredictionValue[] value;

        public Object getValue() {
            return value;
        }

        public String getObservedAt () {
            return observedAt;
        }

    }

        public AirQualityPrediction getAirQualityPrediction() {
            return airQualityPrediction;
        }
    }

    public class AirQualityIndexPrediction {
        private String observedAt;
        private String type;
//        private AirQualityIndexPredictionValue[] value;
        private Object value;

        public Object getValue() {
            return value;
        }

        public String getObservedAt() {
            return observedAt;
        }

//        public class AirQualityIndexPredictionValue {
//            private Number totalIndex;
//            private String totalCategory;
//            private String so2Category;
//            private String coCategory;
//            private String o3Category;
//            private String no2Category;
//            private String pm10Category;
//            private String pm25Category;
//            private String predictedAt;
//
//            public Number getTotalIndex() {
//                return totalIndex;
//            }
//
//            public String getTotalCategory() {
//                return totalCategory;
//            }
//
//            public String getSO2Category() {
//                return so2Category;
//            }
//
//            public String getCOCategory() {
//                return coCategory;
//            }
//
//            public String getO3Category() {
//                return o3Category;
//            }
//
//            public String getNO2Category() {
//                return no2Category;
//            }
//
//            public String getPM10Category() {
//                return pm10Category;
//            }
//
//            public String getPM25Category() {
//                return pm25Category;
//            }
//
//            public String getPredictedAt() {
//                return predictedAt;
//            }
//
//        }
//        public AirQualityIndexPredictionValue getValue(int i) {
//            return value[i];
//        }
    }

    public AirQualityIndexPrediction getAirQualityIndexPrediction() {
        return airQualityIndexPrediction;
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

}
