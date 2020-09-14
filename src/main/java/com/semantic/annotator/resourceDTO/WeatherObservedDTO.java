package com.semantic.annotator.resourceDTO;

public class WeatherObservedDTO {
    private String id;
    private String weatherObservation;
    private String weatherEvaluationHasRecord;

    private String addressName1 = "addressCountry";
    private String addressCountry;
    private String addressName2 = "addressRegion";
    private String addressRegion;
    private String addressName3 = "addressLocality";
    private String addressLocality;
    private String addressName4 = "streetAddress";
    private String streetAddress;
    private String addressName5 = "addressTown";
    private String addressTown;

    private String locationType;
    private String latitute;
    private String longitude;

    private String modifiedAt;
    private String createdAt;
    private String observedAt;

    public void setId(String id) {
        this.id = id;
    }

    public void setWeatherObservation(String weatherObservation) {
        this.weatherObservation = weatherObservation;
    }

    public void setWeatherEvaluationHasRecord(String weatherEvaluationHasRecord) {
        this.weatherEvaluationHasRecord = weatherEvaluationHasRecord;
    }

    public void setAddressName1(String addressName1) {
        this.addressName1 = addressName1;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setAddressName2(String addressName2) {
        this.addressName2 = addressName2;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public void setAddressName3(String addressName3) {
        this.addressName3 = addressName3;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public void setAddressName4(String addressName4) {
        this.addressName4 = addressName4;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setAddressName5(String addressName5) {
        this.addressName5 = addressName5;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt.split(",")[0]+"+09:00";
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt.split(",")[0]+"+09:00";
    }

    public void setObservedAt(String observedAt) {
        this.observedAt = observedAt.split(",")[0]+"+09:00";
    }
}
