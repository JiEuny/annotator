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
    private Number locationLatitute;
    private Number locationLongitude;

    private String modifiedAt;
    private String createdAt;
    private String observedAt;
}
