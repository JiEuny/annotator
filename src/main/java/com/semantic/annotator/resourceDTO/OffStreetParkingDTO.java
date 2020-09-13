package com.semantic.annotator.resourceDTO;

public class OffStreetParkingDTO {

    private String id;
    private String name;
    private String locationTag;
    private String category0;
    private String category1;
    private String  totalSpotNumber;
    private String availableSpotNumber;
    private String status0;
    private String status1;
    private String telephone;
    private String email;
    private String contactType;
    private String paymentType0;
    private String paymentType1;
    private String priceRate;
    private String priceCurrency;
    private String image;
    private String locationType;
    private String latitute;
    private String longitude;
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
    private String createdAt;
    private String modifiedAt;
    private String openingHours = "1111-11-11T00:00:00";
    private String endingHours = "1111-11-11T23:59:59";
    private String openingType = "OpeningHours";
    private String endingType = "OpeningHours";
    private String estimatedValue;    //getCongestionIndexPrediction().getValue().getIndex().toString()
    private String predictedAt;     //getCongestionIndexPrediction().getValue().getPredictedAt(0).toString().split(",")[0]+"+09:00"

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationTag(String locationTag) {
        this.locationTag = locationTag;
    }

    public void setCategory0(String category0) {
        this.category0 = category0;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public void setTotalSpotNumber(String  totalSpotNumber) {
        this.totalSpotNumber = totalSpotNumber;
    }

    public void setAvailableSpotNumber(String availableSpotNumber) {
        this.availableSpotNumber = availableSpotNumber;
    }

    public void setStatus0(String status0) {
        this.status0 = status0;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public void setPaymentType0(String paymentType0) {
        this.paymentType0 = paymentType0;
    }

    public void setPaymentType1(String paymentType1) {
        this.paymentType1 = paymentType1;
    }

    public void setPriceRate(String priceRate) {
        this.priceRate = priceRate;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public void setImage(String image) {
        this.image = image;
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

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt.split(",")[0]+"+09:00";
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt.split(",")[0]+"+09:00";
    }

    public void setEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue.toString();
    }

    public void setPredictedAt(String predictedAt) {
        this.predictedAt = predictedAt.split(",")[0]+"+09:00";
    }
}
