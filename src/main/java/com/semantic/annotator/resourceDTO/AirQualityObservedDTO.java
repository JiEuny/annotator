package com.semantic.annotator.resourceDTO;

public class AirQualityObservedDTO {

    private String id;                  //getId()   
    private String observedValue1;      //getAirQualityObservation().getValue()
    private String observedValue2;      //getAirQualityIndexObservation().getValue()
    private String indexRef;            //getIndexRef().getValue();
    private String evaluationValue1;    //getAirQualityObservation().getValue()
    private String evaluationValue2;    //getAirQualityIndexObservation().getValue()   
    private String locationName1 = "addressCountry";
    private String addressCountry;      
    private String locationName2 = "addressRegion";
    private String addressRegion;
    private String locationName3 = "addressLocality";
    private String addressLocality;
    private String locationName4 = "streetAddress";
    private String streetAddress; 
    private String locationName5 = "addressTown";
    private String addressTown; 
    private String locationType;
    private String latitute;
    private String longitude;
    private String modifiedAt;
    private String createdAt;
    private String observedAt1;         // getAirQualityObservation().getObservedAt()
    private String observedAt2;         // getAirQualityIndexObservation().getObservedAt()

    public void setId(String id) {
        this.id = id;
    }

    public void setObservedValue1(String observedValue1) {
        this.observedValue1 = observedValue1.toString();
    }

    public void setObservedValue2(String observedValue2) {
        this.observedValue2 = observedValue2.toString();
    }

    public void setIndexRef(String indexRef) {
        this.indexRef = indexRef; 
    }

    public void setEvaluationValue1(String evaluationValue1){
        this.evaluationValue1 = evaluationValue1;
    }
    
    public void setEvaluationValue2(String evaluationValue2) {
        this.evaluationValue2 = evaluationValue2;
    }

    public void setLocationName1(String locationName1) {
        this.locationName1 = locationName1;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setLocationName2(String locationName2) {
        this.locationName2 = locationName2;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public void setLocationName3(String locationName3) {
        this.locationName3 = locationName3;
    }
    
    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public void setLocationName4(String locationName4) {
        this.locationName4 = locationName4;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setLocationName5(String locationName5) {
        this.locationName5 = locationName5;
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
    
    public void setObservedAt1(String observedAt1) {
        this.observedAt1 = observedAt1.split(",")[0]+"+09:00";
    }

    public void setObservedAt2(String observedAt2) {
        this.observedAt2 = observedAt2.split(",")[0]+"+09:00";
    }

    public String getOrder(int i) {
        String result = "";
        switch (i) {
            case 0: result = id; break;
            case 1: result = observedValue1; break;
            case 2: result = observedValue2; break;
            case 3: result = indexRef; break;
            case 4: result = evaluationValue1; break;
            case 5: result = evaluationValue2; break;
            case 6: result = locationName1; break;
            case 7: result = addressCountry; break;
            case 8: result = locationName2; break;
            case 9: result = addressRegion; break;
            case 10: result = locationName3; break;
            case 11: result = addressLocality; break;
            case 12: result = locationName4; break;
            case 13: result = streetAddress; break;
            case 14: result = locationName5; break;
            case 15: result = addressTown; break;
            case 16: result = locationType; break;
            case 17: result = latitute; break;
            case 18: result = longitude; break;
            case 19: result = modifiedAt; break;
            case 20: result = createdAt; break;
            case 21: result = observedAt1; break;
            case 22: result = observedAt2; break;
        }
        return result;
    }
}
