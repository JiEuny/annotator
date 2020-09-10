package com.semantic.annotator.resourceDTO;

public class AirQualityForecastDTO {

    private String id;                          //getId()   
    private String estimatedValue1;             //getAirQualityPrediction().getValue(0)
    private String estimatedValue2;             //getAirQualityIndexPrediction().getValue(0)
    private String evaluationValue1;            //getAirQualityPrediction().getValue(0)
    private String evaluationValue2;            //getAirQualityIndexPrediction().getValue(0)
    //private String indexRef;               // template json 파일에 값 없음, Guideline page11 에 skipped 표시
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
    private Number locationLatitute;
    private Number locationLongitude;   
    private String modifiedAt;          
    private String createdAt;           
    private String observedAt1;                  //getAirQualityPrediction().getObservedAt()
    private String observedAt2;                  //getAirQualityIndexPrediction().getObservedAt()

    public void setId(String id) {
        this.id = id;
    }

    public void setEstimatedValue1(String estimatedValue1) {
        this.estimatedValue1 = estimatedValue1;
    }

    public void setEstimatedValue2(String estimatedValue2) {
        this.estimatedValue2 = estimatedValue2;
    }

    public void setEvaluationValue1(String evaluationValue1) {
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
    
    public void setLocationLatitute(Number locationLatitute) {
        this.locationLatitute = locationLatitute;
    }

    public void setLocationLongitude(Number locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public void setObservedAt1(String observedAt1) {
        this.observedAt1 = observedAt1;
    }
    
    public void setObservedAt2(String observedAt2) {
        this.observedAt2 = observedAt2;
    }
}
