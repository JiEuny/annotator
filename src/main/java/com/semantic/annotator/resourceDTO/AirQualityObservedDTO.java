package com.semantic.annotator.resourceDTO;

public class AirQualityObservedDTO {

    private String id;                  //getId()   
    private String observedValue1;      //getAirQualityObservation().getValue()
    private String observedValue2;      //getAirQualityIndexObservation().getValue()
    private String indexRef;            //getIndexRef().getValue();
    private String evaluationValue1;    //getAirQualityObservation().getValue()
    private String evaluationValue2;    //getAirQualityIndexObservation().getValue()   
    private String locationName1 = "addressCountry";
    private String addressCountry;      //getAddress().getValue().getAddressCountry()
    private String locationName2 = "addressRegion";
    private String addressRegion;       //getAddress().getValue().getAddressRegion()
    private String locationName3 = "addressLocality";
    private String addressLocality;     //getAddress().getValue().getAddressLocality()
    private String locationName4 = "streetAddress";
    private String streetAddress;       //getAddress().getValue().getStreetAddress()
    private String locationName5 = "addressTown";
    private String addressTown;         //getAddress().getValue().getAddressTown()
    private String locationType;        //getLocation().getValue().getType()
    private String latitute;     
    private String longitude;    
    private String createdAt;       //getCreatedAt().split(",")[0]+"+09:00"
    private String modifiedAt;      //getModifiedAt().split(",")[0]+"+09:00"
    private String evaluatedOn1;    // getAirQualityObservation().getObservedAt()
    private String evaluatedOn2;    // getAirQualityIndexObservation().getObservedAt()

}
