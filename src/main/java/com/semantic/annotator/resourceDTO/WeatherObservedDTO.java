package com.semantic.annotator.resourceDTO;

public class WeatherObservedDTO {
    private String id;
    private String weatherObservation;

    //CHECK air-quality#WeatherEvaluation_1
    // private String hasRecord;

    private String addressName1 = "addressCountry";
    private String addressCountry;      //getAddress().getValue().getAddressCountry()
    private String addressName2 = "addressRegion";
    private String addressRegion;       //getAddress().getValue().getAddressRegion()
    private String addressName3 = "addressLocality";
    private String addressLocality;     //getAddress().getValue().getAddressLocality()
    private String addressName4 = "streetAddress";
    private String streetAddress;       //getAddress().getValue().getStreetAddress()
    private String addressName5 = "addressTown";
    private String addressTown;     //getAddress().getValue().getAddressTown()

    private String locationType;
    private Number locationLatitute;
    private Number locationLongitude;

    private String modifiedAt;
    private String createdAt;

    //CHECK Instant_3 ppt:WeatherEvaluation
    //private String evaluatedOn;
}
