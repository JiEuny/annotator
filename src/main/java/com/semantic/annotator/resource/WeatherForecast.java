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
    
    public Location getLocation() {
        return location;
    }

    public Address getAddress() {
        return address;
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
            private String rainType;
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

            public String getRainType() {
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

}
